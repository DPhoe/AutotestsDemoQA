package tests;

import framework.baseTest.BaseTest;
import framework.elements.Tables;
import framework.utilities.DriverSingleton;
import org.openqa.selenium.By;
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
        DemoqaLandingPage demoqaLandingPage =
                new DemoqaLandingPage(By.xpath("//img[contains(@class, 'banner')]"), "DemoQA banner on landing page");
        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
        demoqaLandingPage.getElementsButton().waitAndClick();
        demoqaLandingPage.getWebTablesButton().waitAndClick();
        DemoqaWebTablesPage demoqaWebTablesPage =
                new DemoqaWebTablesPage(By.xpath("//div[@class='web-tables-wrapper']"), "DemoQA web tablet wrapper");
        Assert.assertTrue(demoqaWebTablesPage.isUniqueElementDisplayed(), "Web tables form is not displayed");
        demoqaWebTablesPage.getAddButton().waitAndClick();
        DemoqaWebTablesPage.RegistrationForm.sendRecordDataInTable(firstName, lastName, eMail, age, salary, department);
        int recordCount = Tables.getNotEmptyTableRowCountBySymbol(By.xpath("//div[@class='rt-tr-group']"), "@");
        Assert.assertTrue(demoqaWebTablesPage.getNewTableRow(recordCount).getText().contains(firstName) &&
                demoqaWebTablesPage.getNewTableRow(recordCount).getText().contains(lastName) &&
                demoqaWebTablesPage.getNewTableRow(recordCount).getText().contains(eMail) &&
                demoqaWebTablesPage.getNewTableRow(recordCount).getText().contains(age) &&
                demoqaWebTablesPage.getNewTableRow(recordCount).getText().contains(salary) &&
                demoqaWebTablesPage.getNewTableRow(recordCount).getText().contains(department), "Results in table not match entered data");
        demoqaWebTablesPage.getDeleteRecordButton(recordCount).waitAndClick();
        Assert.assertTrue(Tables.getNotEmptyTableRowCountBySymbol(By.xpath("//div[@class='rt-tr-group']"), "@")
                < recordCount, "Record didn't deleted");
    }
}
