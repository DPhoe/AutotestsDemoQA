package pagesDemoQA;

import framework.elements.Link;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaLinksPage extends BasePage {

    public DemoqaLinksPage() {
        super(By.xpath("//div[@id='linkWrapper']"), "Link wrapper on links page");
    }

    private final Link simpleLink = new Link(By.xpath("//a[@id='simpleLink']"), "Home link");

    public Link getSimpleLink() {
        return simpleLink;
    }
}
