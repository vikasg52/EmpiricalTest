package utils;

import managedriver.DriverManager;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowUtil {

    public void switchToNewTab() {
        WebDriver driver = DriverManager.getDriver();
        String original = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        List<String> windowList = new ArrayList<>(allWindows);
        for (String window : windowList) {
            if (!window.equals(original)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }
}
