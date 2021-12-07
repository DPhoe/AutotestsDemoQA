package tests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pages.DemoqaLandingPage;
import pages.pages.DemoqaUploadDownloadPage;
import utilities.BrowserActions;
import utilities.ConfigManager;

public class FileOperationTest extends BaseTest {

    @Test
    public void FileTest () throws InterruptedException {
        BrowserActions.open(ConfigManager.getURL());
        Assert.assertTrue(DemoqaLandingPage.isDemoQABannerDisplayed(), "Unique page element is not displayed");
        DemoqaLandingPage.clickElementsButton();
        BrowserActions.scroll(1000);
        DemoqaLandingPage.clickUploadDownloadButton();
        Assert.assertTrue(DemoqaUploadDownloadPage.isUploadDownloadPageOpen(), "Upload-download page is not open");
        DemoqaUploadDownloadPage.clickDownloadButton();
        BrowserActions.waitForFileToBeDownloaded();
        DemoqaUploadDownloadPage.uploadFile();
        Assert.assertTrue(DemoqaUploadDownloadPage.getUploadedFilePath().contains("sampleFile"), "Text do not contains file name");

    }
}
