package framework.elements;

import framework.baseElement.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import framework.utilities.LoggerUtility;

public class Selects extends BaseElement {

    public Selects(By locator, String name) {
        super(locator, name);
    }

    public void selectByIndex (By locator, int index, String name) {
        LoggerUtility.log.info(name);
        Select selects = new Select(BaseElement.findElement(locator));
        selects.selectByIndex(index);
    }

    public void selectByValue (By locator, String value, String name) {
        LoggerUtility.log.info(name);
        Select selects = new Select(BaseElement.findElement(locator));
        selects.selectByValue(value);
    }

    public void selectByVisibleText (By locator, String text, String name) {
        LoggerUtility.log.info(name);
        Select selects = new Select(BaseElement.findElement(locator));
        selects.selectByVisibleText(text);
    }
}
