package tests;

import framework.baseTest.BaseTest;
import framework.utilities.FileDownloadManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import framework.utilities.BrowserActions;
import framework.utilities.ConfigManager;

public class FileOperationTest extends BaseTest {

    @Test
    public void FileTest () throws InterruptedException {
        BrowserActions.open(ConfigManager.getURL());
        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
        demoqaLandingPage.getElementsButton().waitAndClick();
        BrowserActions.scroll(1000);
        demoqaLandingPage.getUploadDownloadButton().waitAndClick();
        Assert.assertTrue(demoqaUploadDownloadPage.isUniqueElementDisplayed(), "Upload-download page is not open");
        demoqaUploadDownloadPage.getDownloadButton().waitAndClick();
        FileDownloadManager.waitForFileToBeDownloaded(ConfigManager.getFilePath(), "sampleFile.jpeg");
        demoqaUploadDownloadPage.getUploadFileButton().sendKeys(ConfigManager.getFilePath() + "sampleFile.jpeg");
        Assert.assertTrue(demoqaUploadDownloadPage.getUploadedFilePathTextField().getText().contains("sampleFile"), "Text do not contains file name");

    }
}
