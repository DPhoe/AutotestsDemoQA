package tests;

import framework.baseTest.BaseTest;
import framework.utilities.Parser;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import framework.utilities.BrowserActions;
import framework.utilities.ConfigManager;
import pagesDemoQA.DemoqaLandingPage;
import pagesDemoQA.DemoqaWidgetsPage;

import static framework.utilities.RandomGenerator.randomInt;

public class SliderProgressTest extends BaseTest {

    @Test (timeOut = 20000)
    public void SliderTest () {
        BrowserActions.open(ConfigManager.getURL());
        DemoqaLandingPage demoqaLandingPage =
                new DemoqaLandingPage(By.xpath("//img[contains(@class, 'banner')]"), "DemoQA banner on landing page");
        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
        demoqaLandingPage.getWidgetsButton().waitAndClick();
        BrowserActions.scroll(1000);
        demoqaLandingPage.getSliderButton().waitAndClick();
        int random = randomInt;
        DemoqaWidgetsPage demoqaWidgetsPage =
                new DemoqaWidgetsPage(By.xpath("//div[@id='progressBarContainer']"), "Progress bar container");
        demoqaWidgetsPage.getSlider().moveSliderWithArrowKeys(random, 25);
        Assert.assertEquals(random, Parser.stringToInt(demoqaWidgetsPage.getSliderValueField().getAttribute("Value",
                "Get value")));
        BrowserActions.scroll(1000);
        demoqaWidgetsPage.getProgressBarButton().waitAndClick();
        Assert.assertTrue(demoqaWidgetsPage.isUniqueElementDisplayed(), "Progress bar form is not open");
        BrowserActions.scroll(-1000);
        demoqaWidgetsPage.getStartStopButton().waitAndClick();
        int Age = 30;
        demoqaWidgetsPage.progressBarStopper(Age);
        Assert.assertTrue(Math.abs(demoqaWidgetsPage.getCurrentProgressBarValue() - Age) <= 2,
                "Difference between set value and actual value is more then 2%");

    }
}
