package pagesDemoQA;

import framework.baseElement.BaseElement;
import framework.elements.Button;
import framework.elements.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import framework.basePage.BasePage;

import javax.xml.soap.Text;
import java.util.List;

public class DemoqaWebTablesPage extends BasePage {

    public DemoqaWebTablesPage(By locator, String name) {
        super(locator, name);
    }

    public DemoqaWebTablesPage() {
        super();
    }

    public final Button addButton = new Button(By.xpath("//button[@id='addNewRecordButton']"), "Add new record button");
    public final TextField newTableRow = new TextField(By.xpath("//div[@class='rt-tr-group'][4]"), "Add new record button");
    public final Button deleteRecordButton = new Button(By.xpath("//span[@id='delete-record-4']"), "Add new record button");

    public int getNotEmptyRecordCount() {
        List<WebElement> rows = BaseElement.findElements(By.xpath("//div[@class='rt-tr-group']"));
        int len;
        for (len = 0; len <= 10; len += 1) {
            if (rows.get(len).getText().contains("@")) {
                continue;
            } else return len;
        } return len;
    }


    public static class RegistrationForm extends DemoqaWebTablesPage {
        private final TextField firstNameField = new TextField(By.xpath("//input[@id='firstName']"), "First name text field");
        private final TextField lastNameField = new TextField(By.xpath("//input[@id='lastName']"), "Last name text field");
        private final TextField eMailField = new TextField(By.xpath("//input[@id='userEmail']"), "E-mail text field");
        private final TextField ageField = new TextField(By.xpath("//input[@id='age']"), "Age text field");
        private final TextField salaryField = new TextField(By.xpath("//input[@id='salary']"), "Salary text field");
        private final TextField departmentField = new TextField(By.xpath("//input[@id='department']"), "Department text field");
        private final Button submitButton = new Button(By.xpath("//button[@id='submit']"), "");

        public void sendRecordDataInTable(String firstName, String lastName, String eMail, String age, String salary, String department) {
            firstNameField.sendKeys("Send first name");
            lastNameField.sendKeys("Send last name");
            eMailField.sendKeys("Send E-mail");
            ageField.sendKeys("Send age");
            salaryField.sendKeys("Send salary");
            departmentField.sendKeys("Send department");
            submitButton.waitAndClick();
        }


    }
}
