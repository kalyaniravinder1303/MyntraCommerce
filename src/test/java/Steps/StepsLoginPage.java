package Steps;


import Pages.MyntraHomePage;
import Pages.MyntraLoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Driver;


public class StepsLoginPage {
    WebDriver driver;
    MyntraHomePage homePage;
    MyntraLoginPage loginPage;

    @Then("direct to Login Page")
    public void direct_to_login_page() throws InterruptedException {
        driver = Driver.getDriver();
        driver.get("http://automationpractice.com/index.php");
        homePage = new MyntraHomePage(driver);
//       loginPage = new MyntraLoginPage(driver);
       Thread.sleep(5000);
       homePage.clickSignIn();
    }

    @Then("mention the login credentials")
    public void mention_the_login_credentials() throws InterruptedException {

        loginPage = new MyntraLoginPage(driver);
        Thread.sleep(5000);
        loginPage.loginCredentials();
        }

    @Then("{string} should be displayed")
    public void should_be_displayed(String string) {
        loginPage = new MyntraLoginPage(driver);
        Assert.assertTrue(loginPage.registrationText().contains(string));
    }

}
