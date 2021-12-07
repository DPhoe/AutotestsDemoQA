package pages.pages;

import elements.baseElement.BaseElement;
import elements.elements.Button;
import elements.elements.Slider;
import elements.elements.TextField;
import org.openqa.selenium.By;
import pages.basePage.BasePage;
import utilities.DriverSingleton;
import utilities.Parser;

public class DemoqaWidgetsPage extends BasePage {

    private static final By slider = By.xpath("//input[contains(@class,'slid')]");
    private static final By sliderValueField = By.xpath("//input[@id='sliderValue']");
    private static final By progressBar = By.xpath("//span[contains(text(),'ress')]/parent::li");
    private static final By progressBarContainer = By.xpath("//div[@id='progressBarContainer']");
    private static final By startStopButton = By.xpath("//button[@id='startStopButton']");
    private static final By progressBarRole = By.xpath("//div[@role='progressbar']");

    public static void moveSliderToZero() {
        Slider.moveSliderByPixels(slider, 0, 0);
    }

    public static int getSliderValueInt() {
        String sliderText = DriverSingleton.getDriver().findElement(sliderValueField).getAttribute( "Value");
        int sliderInteger = Parser.stringToInt(sliderText);
        return sliderInteger;
    }

    public static void moveSliderWithKeys(int value) {
        Slider.moveSliderWithArrowKeys(value, slider);
    }

    public static void clickProgressBarButton() {
        Button.click(progressBar, "Click progress bar button");
    }

    public static boolean isProgressBarContainerVisible() {
        return BasePage.isUniqueElementDisplayed(progressBarContainer, "Check is progress bar container is visible");
    }

    public static void clickStartStopButton() {
        Button.click(startStopButton, "Click start button under progress bar");
    }

    public static int getCurrentProgressBarValue() {
        String sliderText = DriverSingleton.getDriver().findElement(progressBarRole).getAttribute( "aria-valuenow");
        int sliderInteger = Parser.stringToInt(sliderText);
        return sliderInteger;
    }

    public static void progressBarStopper(int Age) {
        while (getCurrentProgressBarValue() < Age) {
            continue;
        }
        clickStartStopButton();
    }
}
