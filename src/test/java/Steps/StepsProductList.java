package Steps;

import Pages.MyntraHomePage;
import Pages.MyntraProductList;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Driver;

public class StepsProductList {
WebDriver driver;
MyntraHomePage homePage;
MyntraProductList productList;
    @Given("List of products dispalyed")
    public void list_of_products_dispalyed() {
    driver = Driver.getDriver();
    driver.get("http://automationpractice.com/index.php");
    homePage = new MyntraHomePage(driver);
    productList = new MyntraProductList(driver);
    homePage.sendSearchKey("Summer Dresses");
    homePage.searchCount();
    Assert.assertFalse(productList.searchCount().contains("0 results have been found."));

    }

    @Then("product is selected for details")
    public void product_is_selected_for_details() {
    productList = new MyntraProductList(driver);
    productList.selectSortByDropDown();

    }

}
