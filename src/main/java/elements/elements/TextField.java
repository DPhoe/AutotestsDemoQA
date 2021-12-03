package elements.elements;

import elements.baseElement.BaseElement;
import org.openqa.selenium.By;

public class TextField extends BaseElement {
    public TextField(By locator, String name) {
        super(locator, name);
    }

    public static void sendKeys (By locator, String text) {
        findElement(locator).sendKeys(text);
    }

}
