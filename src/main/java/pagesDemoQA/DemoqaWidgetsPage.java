package pagesDemoQA;

import framework.elements.Button;
import framework.elements.Slider;
import framework.elements.TextField;
import org.openqa.selenium.By;
import framework.basePage.BasePage;
import framework.utilities.DriverSingleton;
import framework.utilities.Parser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class DemoqaWidgetsPage extends BasePage {

    private static final By progressBarRole = By.xpath("//div[@role='progressbar']");

    public DemoqaWidgetsPage() {
        super(By.xpath("//div[@id='progressBarContainer']"), "Progress bar container");
    }

    private final Slider slider = new Slider(By.xpath("//input[contains(@class,'slid')]"), "Simple slider, default value '25' ");
    private final TextField sliderValueField = new TextField(By.xpath("//input[@id='sliderValue']"), "Slider value field");
    private final Button progressBarButton = new Button(By.xpath("//span[contains(text(),'ress')]/parent::li"), "Progress bar button");
    private final Button startStopButton = new Button(By.xpath("//button[@id='startStopButton']"), "Start & stop button");

    public int getSliderValueInt() {
        int sliderInteger = Parser.stringToInt(sliderValueField.getAttribute( "Value", "Get Value attribute"));
        return sliderInteger;
    }

    public int getCurrentProgressBarValue() {
        String sliderText = DriverSingleton.getDriver().findElement(progressBarRole).getAttribute( "aria-valuenow");
        int sliderInteger = Parser.stringToInt(sliderText);
        return sliderInteger;
    }

    public void progressBarStopper(int Age) {
        Wait wait = new FluentWait(DriverSingleton.getDriver())
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(50));
        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@id='progressBar']/div"), "aria-valuenow",
                Integer.toString(Age)));
        startStopButton.waitAndClick();
    }

    public Slider getSlider() {
        return slider;
    }

    public TextField getSliderValueField() {
        return sliderValueField;
    }

    public Button getProgressBarButton() {
        return progressBarButton;
    }

    public Button getStartStopButton() {
        return startStopButton;
    }
}
