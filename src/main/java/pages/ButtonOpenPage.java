package pages;

import base.BasePage;
import locators.objects;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ButtonOpenPage extends BasePage {
    WebDriverWait wait;


    public void clickButton(String buttonText) {
        driver.findElement(By.xpath("//button[normalize-space(text())='" + buttonText + "']")).click();
    }

    public boolean isSignUpButtonVisible() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(objects.SIGN_UP_BUTTON));
            return element.isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }
}
