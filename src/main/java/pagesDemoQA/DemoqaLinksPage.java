package pagesDemoQA;

import framework.elements.Button;
import framework.elements.Link;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaLinksPage extends BasePage {

    public DemoqaLinksPage(By locator, String name) {
        super(locator, name);
    }

    public final Link simpleLink = new Link(By.xpath("//a[@id='simpleLink']"), "Home link");

}
