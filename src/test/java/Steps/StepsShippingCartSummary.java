package Steps;

import Pages.*;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Driver;
import utils.JSExecuteUtils;

import static utils.JSExecuteUtils.clickUsingJSExecute;

public class StepsShippingCartSummary {
    WebDriver driver;
    MyntraHomePage homePage;
    MyntraLoginPage loginPage;
    MyntraRegistrationPage registrationPage;
    MyntraProductList productList;
    MyntraProductDetails productDetails;
    MyntraCheckoutPage checkoutPage;
    MyntraShippingCartSummaryPage shippingCartSummaryPage;


    @Given("i am on the summary page")
    public void i_am_on_the_summary_page() {
    driver = Driver.getDriver();
    driver.get("http://automationpractice.com/index.php");
    homePage = new MyntraHomePage(driver);
    homePage.sendSearchKey("Summer Dresses");
    productList = new MyntraProductList(driver);
    productList.selectSortByDropDown();
    productDetails = new MyntraProductDetails(driver);
    productDetails.specifyProductDetails();
    checkoutPage = new MyntraCheckoutPage(driver);
    checkoutPage.checkoutProcess();
    shippingCartSummaryPage = new MyntraShippingCartSummaryPage(driver);
    shippingCartSummaryPage.stepSummary();
    }
    @When("i provide Login credentials")
    public void i_provide_login_credentials() throws InterruptedException {
    shippingCartSummaryPage = new MyntraShippingCartSummaryPage(driver);
    loginPage = new MyntraLoginPage(driver);
    loginPage.randomStringGeneratorForNewUser();
    registrationPage = new MyntraRegistrationPage(driver);
    registrationPage.registrationDetails();
    shippingCartSummaryPage.stepSignIn();
    Thread.sleep(5000);

    }

    @Then("i should be directed to Address page")
    public void i_should_be_directed_to_Address_page() throws InterruptedException {
   shippingCartSummaryPage = new MyntraShippingCartSummaryPage(driver);
    Thread.sleep(5000);
    shippingCartSummaryPage.stepAddress();
    }

    @And("i should be directed to Shipping page")
    public void i_should_be_directed_to_Shippping_page() throws InterruptedException {
    shippingCartSummaryPage = new MyntraShippingCartSummaryPage(driver);JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("document.getElementById('cgv').click()");
      clickUsingJSExecute(driver,shippingCartSummaryPage.checkAgreeTerms,"arguments[0].click()");
      clickUsingJSExecute(driver,shippingCartSummaryPage.close, "arguments[0].click()");
    shippingCartSummaryPage.stepShipping();
    }

    @And("Payment process should be done")
    public void Payment_process_should_be_done() throws InterruptedException {
    shippingCartSummaryPage = new MyntraShippingCartSummaryPage(driver);
    Thread.sleep(5000);

    shippingCartSummaryPage.stepPayment();
    Thread.sleep(5000);
    Assert.assertTrue(shippingCartSummaryPage.getConfirmation().contains("ORDER CONFIRMATION"));
    }


}
