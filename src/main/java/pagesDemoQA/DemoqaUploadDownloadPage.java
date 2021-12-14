package pagesDemoQA;

import framework.elements.Button;
import framework.elements.TextField;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaUploadDownloadPage extends BasePage {


    public DemoqaUploadDownloadPage(By locator, String name) {
        super(locator, name);
    }

    private Button downloadButton = new Button(By.xpath("//a[@id='downloadButton']"), "Download button");
    private TextField uploadFileButton = new TextField(By.xpath("//input[@id='uploadFile']"), "Upload button");
    private TextField uploadedFilePathTextField = new TextField(By.xpath("//p[@id='uploadedFilePath']"), "Uploaded file path");

    public Button getDownloadButton() {
        return downloadButton;
    }

    public TextField getUploadFileButton() {
        return uploadFileButton;
    }

    public TextField getUploadedFilePathTextField() {
        return uploadedFilePathTextField;
    }
}
