package framework.elements;

import framework.baseElement.BaseElement;
import org.openqa.selenium.By;

public class Link extends BaseElement {
    public Link(By locator, String name) {
        super(locator, name);
    }
}
