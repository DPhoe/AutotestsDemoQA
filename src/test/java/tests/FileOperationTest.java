package tests;

import framework.baseTest.BaseTest;
import framework.utilities.FileDownloadManager;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import framework.utilities.BrowserActions;
import framework.utilities.ConfigManager;
import pagesDemoQA.DemoqaLandingPage;
import pagesDemoQA.DemoqaUploadDownloadPage;

public class FileOperationTest extends BaseTest {

    @Test
    public void FileTest () throws InterruptedException {
        BrowserActions.open(ConfigManager.getURL());
        DemoqaLandingPage demoqaLandingPage =
                new DemoqaLandingPage(By.xpath("//img[contains(@class, 'banner')]"), "DemoQA banner on landing page");
        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
        demoqaLandingPage.getElementsButton().waitAndClick();
        BrowserActions.scroll(1000);
        DemoqaUploadDownloadPage demoqaUploadDownloadPage =
                new DemoqaUploadDownloadPage(By.xpath("//a[@id='downloadButton']"), "Download button on DemoQA download page");
        demoqaLandingPage.getUploadDownloadButton().waitAndClick();
        Assert.assertTrue(demoqaUploadDownloadPage.isUniqueElementDisplayed(), "Upload-download page is not open");
        demoqaUploadDownloadPage.getDownloadButton().waitAndClick();
        FileDownloadManager.waitForFileToBeDownloaded(ConfigManager.getFilePath(), "sampleFile.jpeg", 4096);
        demoqaUploadDownloadPage.getUploadFileButton().sendKeys(ConfigManager.getFilePath() + "sampleFile.jpeg");
        Assert.assertTrue(demoqaUploadDownloadPage.getUploadedFilePathTextField().getText().contains("sampleFile"),
                "Text do not contains file name");

    }
}
