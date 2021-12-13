package pagesDemoQA;

import framework.elements.Button;
import framework.elements.TextField;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaUploadDownloadPage extends BasePage {


    public DemoqaUploadDownloadPage(By locator, String name) {
        super(locator, name);
    }

    public final Button downloadButton = new Button(By.xpath("//a[@id='downloadButton']"), "Download button");
    public final TextField uploadFileButton = new TextField(By.xpath("//input[@id='uploadFile']"), "Upload button");
    public final TextField uploadedFilePathTextField = new TextField(By.xpath("//p[@id='uploadedFilePath']"), "Uploaded file path");



//    public static void uploadFile() {
//        TextField.sendKeys(uploadFileButton,"C:\\Users\\mkukhar\\Downloads\\sampleFile.jpeg", "Uploading file");
//    }

}
