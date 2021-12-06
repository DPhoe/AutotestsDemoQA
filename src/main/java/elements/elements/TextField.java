package elements.elements;

import elements.baseElement.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigManager;
import utilities.DriverSingleton;
import utilities.LoggerUtility;

import java.time.Duration;

public class TextField extends BaseElement {

    public TextField(By locator, String name) {
        super(locator, name);
    }

    public static void sendKeys(By locator, String text, String name) {
        LoggerUtility.log.info(name);
        BaseElement.findElement(locator).sendKeys(text);
    }

    public static String getText(By locator, String name) {
        LoggerUtility.log.info(name);
        WebElement getText = new WebDriverWait(DriverSingleton.getDriver(),
                Duration.ofSeconds(ConfigManager.getExplicitWaitSec())).until(ExpectedConditions.visibilityOf(findElement(locator)));
        return getText.getText();
    }

}
