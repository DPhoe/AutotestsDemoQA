package pagesDemoQA;

import framework.elements.Button;
import framework.elements.Tables;
import framework.elements.TextField;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaWebTablesPage extends BasePage {

    public DemoqaWebTablesPage() {
        super(By.xpath("//div[@class='web-tables-wrapper']"), "DemoQA web tablet wrapper");
    }

    private Tables table = new Tables(By.xpath("//div[@class='rt-tr-group']"), "User records table");

    private final Button addButton = new Button(By.xpath("//button[@id='addNewRecordButton']"), "Add new record button");
    private TextField newTableRow;
    private Button deleteRecordButton;

    public int getNotEmptyTableRowCountBySymbol(String symbol) {
        return table.getNotEmptyTableRowCountBySymbol(By.xpath("//div[@class='rt-tr-group']"), symbol);
    }

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

        private static final TextField firstNameField = new TextField(By.xpath("//input[@id='firstName']"), "First name text field");
        private static final TextField lastNameField = new TextField(By.xpath("//input[@id='lastName']"), "Last name text field");
        private static final TextField eMailField = new TextField(By.xpath("//input[@id='userEmail']"), "E-mail text field");
        private static final TextField ageField = new TextField(By.xpath("//input[@id='age']"), "Age text field");
        private static final TextField salaryField = new TextField(By.xpath("//input[@id='salary']"), "Salary text field");
        private static final TextField departmentField = new TextField(By.xpath("//input[@id='department']"), "Department text field");
        private static final Button submitButton = new Button(By.xpath("//button[@id='submit']"), "");

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
