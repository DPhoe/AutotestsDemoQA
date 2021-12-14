package tests;

import framework.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pagesDemoQA.DemoqaLandingPage;
import pagesDemoQA.DemoqaWebTablesPage;
import framework.utilities.BrowserActions;
import framework.utilities.ConfigManager;
import framework.utilities.TestDataManager;

import java.io.IOException;
import java.util.ArrayList;

public class TablesTest extends BaseTest {

    @DataProvider(name = "data")
    public Object[][] dpMethod() throws IOException {
        ArrayList<String> data = new ArrayList<>();
        data.addAll(TestDataManager.getFirstRecord());
        ArrayList<String> dataSecond = new ArrayList<>();
        dataSecond.addAll(TestDataManager.getSecondRecord());
        ArrayList<String> dataThird = new ArrayList<>();
        dataThird.addAll(TestDataManager.getThirdRecord());
        return new Object[][] {data.toArray(), dataSecond.toArray(), dataThird.toArray()};
    }


    @Test (dataProvider = "data")
    public void IFrameTest (String firstName, String lastName, String eMail, String age, String salary, String department) {
        BrowserActions.open(ConfigManager.getURL());
        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
        demoqaLandingPage.getElementsButton().waitAndClick();
        demoqaLandingPage.getWebTablesButton().waitAndClick();
        Assert.assertTrue(demoqaWebTablesPage.isUniqueElementDisplayed(), "Web tables form is not displayed");
        demoqaWebTablesPage.getAddButton().waitAndClick();
        DemoqaWebTablesPage.RegistrationForm.sendRecordDataInTable(firstName, lastName, eMail, age, salary, department);
        Assert.assertTrue(demoqaWebTablesPage.getNewTableRow().getText().contains(firstName) &&
                demoqaWebTablesPage.getNewTableRow().getText().contains(lastName) &&
                demoqaWebTablesPage.getNewTableRow().getText().contains(eMail) &&
                demoqaWebTablesPage.getNewTableRow().getText().contains(age) &&
                demoqaWebTablesPage.getNewTableRow().getText().contains(salary) &&
                demoqaWebTablesPage.getNewTableRow().getText().contains(department), "Results in table not match entered data");
        int recordCount = demoqaWebTablesPage.getNotEmptyRecordCount();
        demoqaWebTablesPage.getDeleteRecordButton().waitAndClick();
        Assert.assertTrue(demoqaWebTablesPage.getNotEmptyRecordCount() < recordCount, "Record didn't deleted");
    }
}
