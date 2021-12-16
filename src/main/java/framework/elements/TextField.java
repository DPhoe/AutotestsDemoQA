package framework.elements;

import framework.baseElement.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import framework.utilities.ConfigManager;
import framework.utilities.DriverSingleton;
import framework.utilities.LoggerUtility;

import java.time.Duration;

public class TextField extends BaseElement {

    public TextField(By locator, String name) {
        super(locator, name);
    }

    public void sendKeys(String text) {
        LoggerUtility.log.info(name);
        BaseElement.findElement(locator).sendKeys(text);
    }

    public String getText() {
        LoggerUtility.log.info(name);
        return new WebDriverWait(DriverSingleton.getDriver(),
                Duration.ofSeconds(ConfigManager.getExplicitWaitSec())).until(ExpectedConditions.visibilityOf(findElement(locator))).getText();
    }

}
