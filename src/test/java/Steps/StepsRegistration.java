package Steps;

import Pages.MyntraHomePage;
import Pages.MyntraLoginPage;
import Pages.MyntraRegistrationPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Driver;

public class StepsRegistration {
    WebDriver driver;
    MyntraHomePage homePage;
    MyntraLoginPage loginPage;
    MyntraRegistrationPage registrationPage;

    @Given("i am on the Registration Page")
    public void i_am_on_the_registration_page() {
     driver = Driver.getDriver();
     driver.get("http://automationpractice.com/index.php");
     homePage  = new MyntraHomePage(driver);
     loginPage = new MyntraLoginPage(driver);
     registrationPage = new MyntraRegistrationPage(driver);
     homePage.clickSignIn();
     loginPage.randomStringGeneratorForNewUser();

       }

       @When("mention the Registration Credentials")
    public void mention_the_registration_credentials() {
       registrationPage.registrationDetails();
       Assert.assertTrue(loginPage.registrationText().contains("MY ACCOUNT"));
    }

}
