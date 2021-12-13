package tests;

import framework.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesDemoQA.DemoqaLandingPage;
import pagesDemoQA.DemoqaUploadDownloadPage;
import framework.utilities.BrowserActions;
import framework.utilities.ConfigManager;

public class FileOperationTest extends BaseTest {

    @Test
    public void FileTest () throws InterruptedException {
        BrowserActions.open(ConfigManager.getURL());
        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
        demoqaLandingPage.elementsButton.waitAndClick();
        BrowserActions.scroll(1000);
        demoqaLandingPage.uploadDownloadButton.waitAndClick();
        Assert.assertTrue(demoqaUploadDownloadPage.isUniqueElementDisplayed(), "Upload-download page is not open");
        demoqaUploadDownloadPage.downloadButton.waitAndClick();
        BrowserActions.waitForFileToBeDownloaded();
        demoqaUploadDownloadPage.uploadFileButton.sendKeys("//path");
        Assert.assertTrue(demoqaUploadDownloadPage.uploadedFilePathTextField.getText().contains("sampleFile"), "Text do not contains file name");

    }
}
