package pages.basePage;

import elements.baseElement.BaseElement;;
import org.openqa.selenium.By;
import utilities.LoggerUtility;

public class BasePage {

    protected static boolean isUniqueElementDisplayed(By locator, String name) {
        LoggerUtility.log.info(name);
        if (BaseElement.findElements(locator).size() != 0) {
            return true;
        }
        return false;
    }
}
