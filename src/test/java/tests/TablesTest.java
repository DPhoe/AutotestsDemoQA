package tests;

import framework.baseTest.BaseTest;
import framework.elements.Tables;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pagesDemoQA.DemoqaLandingPage;
import pagesDemoQA.DemoqaWebTablesPage;
import framework.utilities.BrowserActions;
import framework.utilities.ConfigManager;
import framework.utilities.TestDataManager;

public class TablesTest extends BaseTest {

    @DataProvider(name = "data")
    public Object[][] dpMethod() throws Exception {
        return new Object[][] {TestDataManager.addDataToProviderByIndex(0),
                TestDataManager.addDataToProviderByIndex(1),
                TestDataManager.addDataToProviderByIndex(2),
                TestDataManager.addDataToProviderByIndex(3),
                TestDataManager.addDataToProviderByIndex(4),
                TestDataManager.addDataToProviderByIndex(5),
                TestDataManager.addDataToProviderByIndex(6),
                TestDataManager.addDataToProviderByIndex(7),
                TestDataManager.addDataToProviderByIndex(8),
                TestDataManager.addDataToProviderByIndex(9)};
    }

    @Test (dataProvider = "data")
    public void TablesDDTTest (String firstName, String lastName, String eMail, String age, String salary, String department) {
        BrowserActions.open(ConfigManager.getURL());
        DemoqaLandingPage demoqaLandingPage =
                new DemoqaLandingPage();
        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
        demoqaLandingPage.getElementsButton().waitAndClick();
        demoqaLandingPage.getWebTablesButton().waitAndClick();
        DemoqaWebTablesPage demoqaWebTablesPage =
                new DemoqaWebTablesPage();
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
