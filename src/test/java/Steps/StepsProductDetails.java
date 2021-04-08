package Steps;

import Pages.MyntraProductDetails;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Driver;

public class StepsProductDetails {
    WebDriver driver;
    MyntraProductDetails productDetails;

    @Given("i am on the product detials page")
    public void i_am_on_the_product_detials_page() {
    driver = Driver.getDriver();
    driver.get("http://automationpractice.com/index.php?id_product=7&controller=product&search_query=summer+dress&results=4");
    productDetails = new MyntraProductDetails(driver);

    }

     @Then("mention the product seficications to checkout")
    public void mention_the_product_seficications_to_checkout() {
    productDetails = new MyntraProductDetails(driver);
    productDetails.specifyProductDetails();

         }

}
