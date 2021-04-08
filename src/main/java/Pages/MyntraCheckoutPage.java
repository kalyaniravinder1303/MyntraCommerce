package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyntraCheckoutPage {
    public MyntraCheckoutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "a[title='Proceed to checkout'] span")
    public WebElement proceedToCheckoutButton;

    public void checkoutProcess() {
        this.proceedToCheckoutButton.click();
    }
}



