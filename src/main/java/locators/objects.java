package locators;

import org.openqa.selenium.By;

public class objects {
    // click me & sign up page locators
    public static final By SIGN_UP_BUTTON = By.xpath("//a[text()='Sign Up' and @href='/signup']");

    //w3school locators
    public static final By IFRAME = By.name("iframeResult");
    public static final By VISIT_LINK = By.xpath("//a[normalize-space()='Visit W3Schools!']");
    public static final By SEARCH_INPUT = By.xpath("//input[@id='search2']");
}