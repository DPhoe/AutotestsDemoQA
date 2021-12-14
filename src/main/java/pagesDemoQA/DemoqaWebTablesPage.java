package pagesDemoQA;

import framework.baseElement.BaseElement;
import framework.elements.Button;
import framework.elements.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import framework.basePage.BasePage;

import java.util.List;

public class DemoqaWebTablesPage extends BasePage {

    public DemoqaWebTablesPage(By locator, String name) {
        super(locator, name);
    }

    public DemoqaWebTablesPage() {
        super();
    }

    private Button addButton = new Button(By.xpath("//button[@id='addNewRecordButton']"), "Add new record button");
    private TextField newTableRow = new TextField(By.xpath("//div[@class='rt-tr-group'][4]"), "Add new record button");
    private Button deleteRecordButton = new Button(By.xpath("//span[@id='delete-record-4']"), "Delete lats record button");

    public int getNotEmptyRecordCount() {
        List<WebElement> rows = BaseElement.findElements(By.xpath("//div[@class='rt-tr-group']"));
        int len;
        for (len = 0; len <= 10; len += 1) {
            if (rows.get(len).getText().contains("@")) {
                continue;
            } else return len;
        } return len;
    }

    public Button getAddButton() {
        return addButton;
    }

    public TextField getNewTableRow() {
        return newTableRow;
    }

    public Button getDeleteRecordButton() {
        return deleteRecordButton;
    }

    public static class RegistrationForm extends DemoqaWebTablesPage {
        private static TextField firstNameField = new TextField(By.xpath("//input[@id='firstName']"), "First name text field");
        private static TextField lastNameField = new TextField(By.xpath("//input[@id='lastName']"), "Last name text field");
        private static TextField eMailField = new TextField(By.xpath("//input[@id='userEmail']"), "E-mail text field");
        private static TextField ageField = new TextField(By.xpath("//input[@id='age']"), "Age text field");
        private static TextField salaryField = new TextField(By.xpath("//input[@id='salary']"), "Salary text field");
        private static TextField departmentField = new TextField(By.xpath("//input[@id='department']"), "Department text field");
        private static Button submitButton = new Button(By.xpath("//button[@id='submit']"), "");

        public static void sendRecordDataInTable(String firstName, String lastName, String eMail, String age, String salary, String department) {
            firstNameField.sendKeys(firstName);
            lastNameField.sendKeys(lastName);
            eMailField.sendKeys(eMail);
            ageField.sendKeys(age);
            salaryField.sendKeys(salary);
            departmentField.sendKeys(department);
            submitButton.waitAndClick();
        }


    }
}
