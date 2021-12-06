package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.pages.DemoqaLandingPage;
import pages.pages.DemoqaWebTablesPage;
import utilities.BrowserActions;
import utilities.ConfigManager;
import utilities.TestDataManager;

import java.util.ArrayList;

public class TablesTest extends baseTest.BaseTest {

    @DataProvider(name = "data")
    public Object[][] dpMethod(){
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
        Assert.assertTrue(DemoqaLandingPage.isDemoQABannerDisplayed(), "Unique page element is not displayed");
        DemoqaLandingPage.clickElementsButton();
        DemoqaLandingPage.clickWebTablesButton();
        Assert.assertTrue(DemoqaWebTablesPage.isWebTablesWrapperDisplayed(), "Web tables form is not displayed");
        DemoqaWebTablesPage.clickAddButton();
        DemoqaWebTablesPage.RegistrationForm.sendRecordDataInTable(firstName, lastName, eMail, age, salary, department);
        DemoqaWebTablesPage.RegistrationForm.clickSubmitButton();
        Assert.assertTrue(DemoqaWebTablesPage.RegistrationForm.getFourthRowText().contains(firstName) &&
                DemoqaWebTablesPage.RegistrationForm.getFourthRowText().contains(lastName) &&
                DemoqaWebTablesPage.RegistrationForm.getFourthRowText().contains(eMail) &&
                DemoqaWebTablesPage.RegistrationForm.getFourthRowText().contains(age) &&
                DemoqaWebTablesPage.RegistrationForm.getFourthRowText().contains(salary) &&
                DemoqaWebTablesPage.RegistrationForm.getFourthRowText().contains(department), "Results in table not match entered data");
        int recordCount = DemoqaWebTablesPage.getNotEmptyRecordCount();
        DemoqaWebTablesPage.clickDeleteButton();
        Assert.assertTrue(DemoqaWebTablesPage.getNotEmptyRecordCount() < recordCount, "Record didn't deleted");
    }
}
