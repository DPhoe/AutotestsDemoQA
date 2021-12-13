package tests;

import framework.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesDemoQA.DemoqaLandingPage;
import pagesDemoQA.DemoqaWidgetsPage;
import framework.utilities.BrowserActions;
import framework.utilities.ConfigManager;

import static framework.utilities.RandomGenerator.randomInt;

public class SliderProgressTest extends BaseTest {

//    @Test
//    public void SliderTest () {
//        BrowserActions.open(ConfigManager.getURL());
//        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
//        DemoqaLandingPage.clickWidgetsButton();
//        BrowserActions.scroll(1000);
//        DemoqaLandingPage.clickSliderButton();
//        DemoqaWidgetsPage.moveSliderToZero();
//        int random = randomInt;
//        DemoqaWidgetsPage.moveSliderWithKeys(random);
//        Assert.assertEquals(random, DemoqaWidgetsPage.getSliderValueInt(), "Slider value not equals to set value");
//        BrowserActions.scroll(1000);
//        DemoqaWidgetsPage.clickProgressBarButton();
//        Assert.assertTrue(demoqaWidgetsPage.isUniqueElementDisplayed(), "Progress bar form is not open");
//        BrowserActions.scroll(-1000);
//        DemoqaWidgetsPage.clickStartStopButton();
//        int Age = 30;
//        DemoqaWidgetsPage.progressBarStopper(Age);
//        Assert.assertTrue(Math.abs(DemoqaWidgetsPage.getCurrentProgressBarValue() - Age) <= 2,
//                "Difference between set value and actual value is more then 2%");
//
//    }
}
