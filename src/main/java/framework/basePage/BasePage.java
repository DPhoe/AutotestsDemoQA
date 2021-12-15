package framework.basePage;

import framework.baseElement.BaseElement;
import org.openqa.selenium.By;
import framework.utilities.LoggerUtility;

public abstract class BasePage {

    protected String name;
    protected By locator;

    public BasePage (By locator, String name) {
        this.locator = locator;
        this.name = name;

    }

    public BasePage() {
    }

    public boolean isUniqueElementDisplayed() {
        LoggerUtility.log.info(name);
        if (BaseElement.getElementListSize(locator) != 0) {
            return true;
        }
        return false;
    }
}
