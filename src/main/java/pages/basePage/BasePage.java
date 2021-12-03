package pages.basePage;

import elements.baseElement.BaseElement;;
import org.openqa.selenium.By;

public class BasePage {

    protected static boolean isUniqueElementDisplayed(By locator, String name) {
        if (BaseElement.findElements(locator).size() != 0) {
            return true;
        }
        return false;
    }
}
