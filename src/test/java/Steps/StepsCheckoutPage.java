package Steps;

import Pages.MyntraCheckoutPage;
import Pages.MyntraHomePage;
import Pages.MyntraProductDetails;
import Pages.MyntraProductList;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class StepsCheckoutPage {
WebDriver driver;
    MyntraHomePage homePage;
    MyntraProductList productList;
    MyntraProductDetails productDetails;
    MyntraCheckoutPage checkoutPage;


    @Given("i am on the Checkout Page")
    public void i_am_on_the_checkout_page() throws InterruptedException {
    driver = Driver.getDriver();
    driver.get("http://automationpractice.com/index.php");
    homePage = new MyntraHomePage(driver);
    checkoutPage = new MyntraCheckoutPage(driver);
    homePage.sendSearchKey("Summer Dresses");
    productList = new MyntraProductList(driver);
    productList.selectSortByDropDown();
    productDetails = new MyntraProductDetails(driver);
    productDetails.specifyProductDetails();

    }
    @Then("confirm the product")
    public void confirm_the_product() {

    // checkoutPage = new MyntraCheckoutPage(driver);
     checkoutPage.checkoutProcess();


    }

}
