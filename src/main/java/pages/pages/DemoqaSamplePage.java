package pages.pages;

import org.openqa.selenium.By;
import pages.basePage.BasePage;

public class DemoqaSamplePage extends BasePage {

    private static final By uniqueElement = By.xpath("//h1");

    public static boolean isSamplePageHeaderDisplayed() {
        return BasePage.isUniqueElementDisplayed(uniqueElement, "Check is sample page header displayed");
    }

}
