package pagesDemoQA;

import framework.elements.Button;
import framework.elements.TextField;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaWebTablesPage extends BasePage {

    public DemoqaWebTablesPage(By locator, String name) {
        super(locator, name);
    }

    public DemoqaWebTablesPage() {
        super();
    }

    private Button addButton = new Button(By.xpath("//button[@id='addNewRecordButton']"), "Add new record button");
    private TextField newTableRow;
    private Button deleteRecordButton;

    private String createTableRowLocator(int index) {
        String loc = String.format("//div[@class='rt-tr-group'][%d]", index);
        return loc;
    }

    public TextField getNewTableRow(int index) {
        return newTableRow = new TextField(By.xpath(createTableRowLocator(index)), "Add new record button");
    }

    private String createTableDeleteButtonLocator(int index) {
        String loc = String.format("//span[@id='delete-record-%d']", index);
        return loc;
    }

    public Button getDeleteRecordButton(int index) {
        return deleteRecordButton = new Button(By.xpath(createTableDeleteButtonLocator(index)), "Delete lats record button");
    }

    public Button getAddButton() {
        return addButton;
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
