package pages.pages;

import elements.baseElement.BaseElement;
import elements.elements.Button;
import elements.elements.Frames;
import elements.elements.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.basePage.BasePage;
import utilities.DriverSingleton;

public class DemoqaNestedFramesPage extends BasePage {

    private static final By nestedFrameForm = By.xpath("//div[@id='frame1Wrapper']");
    private static final By parentFrameText = By.xpath("//iframe[contains(@srcdoc, 'Child')]/parent::body");
    private static final By parentChildText = By.xpath("//p");
    private static final By framesButton = By.xpath("//span[text()='Frames']/parent::li");
    private static final By framesText = By.xpath("//h1[@id='sampleHeading']");

    public static boolean isNestedFrameFromDisplayed() {
        return BaseElement.isDisplayed(nestedFrameForm, "Check is nested frame form displayed");
    }

    public static void switchToParentFrame() {
        Frames.switchToFrameByNameOrId("frame1", "Switch to parent frame");
    }

    public static String getTextFromParentFrame() {
        return TextField.getText(parentFrameText, "Get parent frame text");
    }

    public static void switchToChildFrame(int index) {
        Frames.switchToFrameByIndex(index, "Switch to child iframe by index" + index);
    }

    public static String getTextFromChildFrame() {
        return TextField.getText(parentChildText, "Get child frame text");
    }

    public static void switchToDefaultContent() {
        Frames.switchToDefault("Switch to default page from frame");
    }

    public static void clickFramesButton() {
        Button.click(framesButton, "Click frame button");
    }

    public static void switchToFrameByIndex(int index) {
        Frames.switchToFrameByIndex(index, "Switch iframe by index" + index);
    }

    public static String getTextFromFrame() {
        WebElement IFrameTextHolder = DriverSingleton.getDriver().findElement(framesText);
        BaseElement.waitElementToBeVisible(IFrameTextHolder, "Wait for element visible");
        return TextField.getText(framesText, "Get text from frame");
    }
}
