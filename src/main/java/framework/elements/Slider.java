package framework.elements;

import framework.baseElement.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pagesDemoQA.DemoqaWidgetsPage;
import framework.utilities.DriverSingleton;

public class Slider extends BaseElement {
    public Slider(By locator, String name) {
        super(locator, name);
    }

    public void moveSliderByPixels(By locator, int x, int y) {
        WebElement slider = BaseElement.findElement(locator);
        Actions move = new Actions(DriverSingleton.getDriver());
        Action action = (Action) move.dragAndDropBy(slider, x, y).build();
        action.perform();
    }

    public void moveSliderWithArrowKeys(int value) {
        DemoqaWidgetsPage page = new DemoqaWidgetsPage();
        if (value <= 50) {
            while (page.getSliderValueInt() != value){
                BaseElement.findElement(locator).sendKeys(Keys.ARROW_LEFT);
            }
        }
        else {
            while (page.getSliderValueInt() != value){
                BaseElement.findElement(locator).sendKeys(Keys.ARROW_RIGHT);
            }
        }
    }
}
