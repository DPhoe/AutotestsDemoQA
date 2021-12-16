package framework.elements;

import framework.baseElement.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Tables extends BaseElement {
    public Tables(By locator, String name) {
        super(locator, name);
    }

    public int getNotEmptyTableRowCountBySymbol(By locator, String symbol) {
        List<WebElement> rows = findElements(locator);
        int len;
        for (len = 0; len <= 10; len += 1) {
            if (rows.get(len).getText().contains(symbol)) {
                continue;
            } else return len;
        } return len;
    }

}
