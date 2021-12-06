package pages.pages;

import elements.baseElement.BaseElement;
import elements.elements.Button;
import elements.elements.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.basePage.BasePage;
import utilities.DriverSingleton;

import java.util.List;

public class DemoqaWebTablesPage extends BasePage {

    private static final By uniqueElement = By.xpath("//div[@class='web-tables-wrapper']");
    private static final By addButton = By.xpath("//button[@id='addNewRecordButton']");
    private static final By newTableRow = By.xpath("//div[@class='rt-tr-group'][4]");
    private static final By allTableRow = By.xpath("//div[@class='rt-tr-group']");
    private static final By deleteRecordButton = By.xpath("//span[@id='delete-record-4']");

    public static boolean isWebTablesWrapperDisplayed () {
        return BasePage.isUniqueElementDisplayed(uniqueElement, "Check is web Tables Form displayed");
    }

    public static void clickAddButton() {
        Button.click(addButton, "Click add new record button");
    }

    public static String getFourthRowText() {
        return TextField.getText(newTableRow, "Get part of text from 4th row to assert");
    }

    public static int getNotEmptyRecordCount() {
        List<WebElement> rows = BaseElement.findElements(allTableRow);
        int len;
        for (len = 0; len <= 10; len += 1) {
            if (rows.get(len).getText().contains("@")) {
                continue;
            } else return len;
        } return len;
    }

    public static void clickDeleteButton() {
        Button.click(deleteRecordButton, "Click delete 4th record button");
    }

    public static class RegistrationForm extends DemoqaWebTablesPage {
        private static final By firstNameField = By.xpath("//input[@id='firstName']");
        private static final By lastNameField = By.xpath("//input[@id='lastName']");
        private static final By eMailField = By.xpath("//input[@id='userEmail']");
        private static final By ageField = By.xpath("//input[@id='age']");
        private static final By salaryField = By.xpath("//input[@id='salary']");
        private static final By departmentField = By.xpath("//input[@id='department']");
        private static final By submitButton = By.xpath("//button[@id='submit']");

        public static void sendRecordDataInTable(String firstName, String lastName, String eMail, String age, String salary, String department) {
            TextField.sendKeys(firstNameField, firstName, "Send first name");
            TextField.sendKeys(lastNameField, lastName, "Send last name");
            TextField.sendKeys(eMailField, eMail, "Send E-mail");
            TextField.sendKeys(ageField, age, "Send age");
            TextField.sendKeys(salaryField, salary, "Send salary");
            TextField.sendKeys(departmentField, department, "Send department");
        }

        public static void clickSubmitButton() {
            Button.click(submitButton, "Click submit button on web tables form");
        }
    }
}
