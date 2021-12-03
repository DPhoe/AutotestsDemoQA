package elements.elements;

import elements.baseElement.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Selects extends BaseElement {

    public Selects(By locator, String name) {
        super(locator, name);
    }

    public void selectByIndex (By locator, int index, String name) {
        Select selects = new Select(BaseElement.findElement(locator));
        selects.selectByIndex(index);
    }

    public void selectByValue (By locator, String value, String name) {
        Select selects = new Select(BaseElement.findElement(locator));
        selects.selectByValue(value);
    }

    public void selectByVisibleText (By locator, String text, String name) {
        Select selects = new Select(BaseElement.findElement(locator));
        selects.selectByVisibleText(text);
    }
}
