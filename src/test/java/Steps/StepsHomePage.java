package Steps;

import Pages.MyntraHomePage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Driver;

public class StepsHomePage {
    WebDriver driver;
    MyntraHomePage homePage;
    @Given("i am on the Homepage")
    public void i_am_on_the_homepage() {
        driver = Driver.getDriver();
        driver.get("http://automationpractice.com/index.php");
    }
    @Then("search for {string} in the searchbox")
    public void search_a_value_in_the_searchbox(String searchValue) {
        homePage = new MyntraHomePage(driver);
        homePage.sendSearchKey(searchValue);
    }
    @Then("i should get the products related to {string}")
    public void i_should_get_the_list_of_values(String searchValue) {
        homePage = new MyntraHomePage(driver);
        homePage.sendSearchKey(searchValue);
        Assert.assertFalse(homePage.searchCount().contains("0 results have been found."));
    }

}
