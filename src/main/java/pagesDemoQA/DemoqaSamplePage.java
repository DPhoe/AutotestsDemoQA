package pagesDemoQA;

import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaSamplePage extends BasePage {

    public DemoqaSamplePage() {
        super(By.xpath("//h1"), "Sample page header");
    }
}
