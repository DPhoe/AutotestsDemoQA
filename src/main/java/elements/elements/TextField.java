package elements.elements;

import elements.baseElement.BaseElement;
import org.openqa.selenium.By;

public class TextField extends BaseElement {

    public TextField(By locator, String name) {
        super(locator, name);
    }

    public static void sendKeys(By locator, String text) {
        BaseElement.findElement(locator).sendKeys(text);
    }

    public static String getText(By locator, String name) {
        return BaseElement.findElement(locator).getText();
    }

}
