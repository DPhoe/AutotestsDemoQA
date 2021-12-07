package pages.pages;

import elements.elements.Button;
import elements.elements.TextField;
import org.openqa.selenium.By;
import pages.basePage.BasePage;

public class DemoqaUploadDownloadPage extends BasePage {

    private static final By downloadButton = By.xpath("//a[@id='downloadButton']");
    private static final By uploadFileButton = By.xpath("//input[@id='uploadFile']");
    private static final By uploadedFilePath = By.xpath("//p[@id='uploadedFilePath']");

    public static boolean isUploadDownloadPageOpen () {
       return BasePage.isUniqueElementDisplayed(downloadButton, "Is download button displayed");
    }

    public static void clickDownloadButton() {
        Button.click(downloadButton, "Click download button");
    }

    public static void uploadFile() {
        TextField.sendKeys(uploadFileButton,"C:\\Users\\mkukhar\\Downloads\\sampleFile.jpeg", "Uploading file");
    }

    public static String getUploadedFilePath() {
        return TextField.getText(uploadedFilePath, "Getting uploaded file path");
    }
}
