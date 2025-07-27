package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import managedriver.DriverManager;

public class Hooks {

    @Before
    public void setUp() {
        String broserName = "chrome";
        DriverManager.initializeDriver(broserName);
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
