package pages;

import base.BasePage;
import locators.objects;

public class W3SchoolsPage extends BasePage {

    public void switchToFrame() {
        driver.switchTo().frame(driver.findElement(objects.IFRAME));
    }

    public void clickVisitLink() {
        driver.findElement(objects.VISIT_LINK).click();
    }

    public boolean isSearchInputVisible() {
        return driver.findElement(objects.SEARCH_INPUT).isDisplayed();
    }
}
