package pagesDemoQA;

import framework.elements.Button;
import framework.elements.Slider;
import framework.elements.TextField;
import org.openqa.selenium.By;
import framework.basePage.BasePage;
import framework.utilities.DriverSingleton;
import framework.utilities.Parser;

public class DemoqaWidgetsPage extends BasePage {

    private static final By progressBarRole = By.xpath("//div[@role='progressbar']");

    public DemoqaWidgetsPage(By locator, String name) {
        super(locator, name);
    }

    public DemoqaWidgetsPage() {}

    private Slider slider = new Slider(By.xpath("//input[contains(@class,'slid')]"), "Simple slider, default value '25' ");
    private TextField sliderValueField = new TextField(By.xpath("//input[@id='sliderValue']"), "Slider value field");
    private Button progressBarButton = new Button(By.xpath("//span[contains(text(),'ress')]/parent::li"), "Progress bar button");
    private Button startStopButton = new Button(By.xpath("//button[@id='startStopButton']"), "Start & stop button");

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
        for (int i = 0; i < 100; i++) {
            while (getCurrentProgressBarValue() < Age) {
                continue;
            }
            startStopButton.waitAndClick();
            break;
        }
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
