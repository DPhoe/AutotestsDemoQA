package pagesDemoQA;

import framework.elements.Button;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaBrowserWindowsPage extends BasePage {

    public DemoqaBrowserWindowsPage() {
        super(By.xpath("//div[@id='browserWindows']"), "Browser window form");
    }

    private final Button newTabButton = new Button(By.xpath("//button[@id='tabButton']"), "New tab button");
    private final Button newWindowButton = new Button(By.xpath("//button[@id='messageWindowButton']"), "New window button");
    private final Button newWindowMessageButton = new Button(By.xpath("//button[@id='messageWindowButton']"), "New window message button");
    private final Button elementsButton = new Button(By.xpath("//div[contains(text(),'men')]/parent::div"), "Elements button");

    public Button getNewTabButton() {
        return newTabButton;
    }

    public Button getNewWindowButton() {
        return newWindowButton;
    }

    public Button getNewWindowMessageButton() {
        return newWindowMessageButton;
    }

    public Button getElementsButton() {
        return elementsButton;
    }

    public Button getLinksButton() {
        return linksButton;
    }

    private Button linksButton = new Button(By.xpath("//span[text()='Links']"), "Links button");
}
