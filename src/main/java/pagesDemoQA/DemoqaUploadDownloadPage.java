package pagesDemoQA;

import framework.elements.Button;
import framework.elements.TextField;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaUploadDownloadPage extends BasePage {


    public DemoqaUploadDownloadPage() {
        super(By.xpath("//a[@id='downloadButton']"), "Download button on DemoQA download page");
    }

    private final Button downloadButton = new Button(By.xpath("//a[@id='downloadButton']"), "Download button");
    private final TextField uploadFileButton = new TextField(By.xpath("//input[@id='uploadFile']"), "Upload button");
    private final TextField uploadedFilePathTextField = new TextField(By.xpath("//p[@id='uploadedFilePath']"), "Uploaded file path");

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
