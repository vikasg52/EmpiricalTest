package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.W3SchoolsPage;
import utils.WindowUtil;

public class W3SchoolsSteps {
    W3SchoolsPage w3;
    WindowUtil util;

    @Given("I launch W3Schools URL {string}")
    public void i_launch_w3schools_url(String url) {
        managedriver.DriverManager.getDriver().get(url);
        w3 = new W3SchoolsPage();
        util = new WindowUtil();
    }

    @When("I click the Visit W3Schools! link")
    public void i_click_the_Visit_W3School_link() {
        w3.switchToFrame();
        w3.clickVisitLink();
        util.switchToNewTab();
    }

    @Then("I should see the search input box")
    public void i_should_see_search_box() {
        Assert.assertTrue(w3.isSearchInputVisible());
    }
}
