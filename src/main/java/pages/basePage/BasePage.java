package pages.basePage;

import elements.elements.Button;
import org.openqa.selenium.By;

public class BasePage {
    public void button () {
        Button.click(new By.ByXPath("locator"), "name");
    }
}
