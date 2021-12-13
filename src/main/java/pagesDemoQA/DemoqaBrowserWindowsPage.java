package pagesDemoQA;

import framework.elements.Button;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaBrowserWindowsPage extends BasePage {

    public DemoqaBrowserWindowsPage(By locator, String name) {
        super(locator, name);
    }

    public final Button newTabButton = new Button(By.xpath("//button[@id='tabButton']"), "New tab button");
    public final Button newWindowButton = new Button(By.xpath("//button[@id='messageWindowButton']"), "New window button");
    public final Button newWindowMessageButton = new Button(By.xpath("//button[@id='messageWindowButton']"), "New window message button");
    public final Button elementsButton = new Button(By.xpath("//div[contains(text(),'men')]/parent::div"), "Elements button");
    public final Button linksButton = new Button(By.xpath("//span[text()='Links']"), "Links button");
}
