package elements.elements;

import elements.baseElement.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.pages.DemoqaWidgetsPage;
import utilities.DriverSingleton;

public class Slider extends BaseElement {
    public Slider(By locator, String name) {
        super(locator, name);
    }

    public static void moveSliderByPixels(By locator, int x, int y) {
        WebElement slider = BaseElement.findElement(locator);
        Actions move = new Actions(DriverSingleton.getDriver());
        Action action = (Action) move.dragAndDropBy(slider, x, y).build();
        action.perform();
    }

    public static void moveSliderWithArrowKeys(int value, By locator) {
        WebElement slider = BaseElement.findElement(locator);
        if (value <= 50) {
            while (DemoqaWidgetsPage.getSliderValueInt() != value){
                slider.sendKeys(Keys.ARROW_LEFT);
            }
        }
        else {
            while (DemoqaWidgetsPage.getSliderValueInt() != value){
                slider.sendKeys(Keys.ARROW_RIGHT);
            }
        }
    }
}
