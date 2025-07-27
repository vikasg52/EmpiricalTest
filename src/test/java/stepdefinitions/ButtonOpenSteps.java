package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ButtonOpenPage;
import utils.WindowUtil;

public class ButtonOpenSteps {
    ButtonOpenPage page;
    WindowUtil util;

    @Given("I open the URL {string}")
    public void i_open_url(String url) {
        managedriver.DriverManager.getDriver().get(url);
        page = new ButtonOpenPage();
        util = new WindowUtil();
    }

    @When("I click the {string} button")
    public void i_click_the_button(String buttonName) {
        System.out.println("Clicking button: " + buttonName);
        page.clickButton(buttonName);
        util.switchToNewTab();
    }


    @Then("I should see the Sign Up button")
    public void i_should_see_the_sign_up_button() throws InterruptedException {
        Assert.assertTrue(page.isSignUpButtonVisible(), "Sign Up button should be visible.");
    }


}