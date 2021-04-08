package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraShippingCartSummaryPage {
    public MyntraShippingCartSummaryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")
    public WebElement ptcSignInButton;
    @FindBy(css = "a.button.btn.btn-default.standard-checkout.button-medium:nth-child(1) > span")
    public WebElement selectSummaryPTCButton;
    @FindBy(css = "body.order.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 form:nth-child(3) p.cart_navigation.clearfix button.button.btn.btn-default.button-medium:nth-child(4) > span:nth-child(1)")
    public WebElement ptcAddress;
    @FindBy(css = "#cgv")
    public WebElement checkAgreeTerms;
    @FindBy(xpath = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
    public WebElement ptcShipping;
    @FindBy(xpath = "//a[@title='Pay by check.']//span[contains(text(),'(order processing will be longer)')]")
    public WebElement selectPayByCheque;
    @FindBy(xpath = "//span[normalize-space()='I confirm my order']")
    public WebElement selectOrderConfirmation;
    @FindBy(css = "h1[class='page-heading']")
    public WebElement orderConfirmatioText;
    @FindBy(css = "label[for='email']")
    public WebElement emailAddressText;
    @FindBy(css = "span[class='ajax_cart_no_product']")
    public WebElement cartinfo;
    @FindBy(xpath = "//a[@title='Close']")
    public WebElement close;
    public void stepSummary() {
        this.selectSummaryPTCButton.click();
    }

    public void stepSignIn() {

        this.ptcSignInButton.click();
    }

    public void stepAddress() {

        this.ptcAddress.click();
    }

    public void stepShipping() throws InterruptedException {
      // this.checkAgreeTerms.click();
      //  Thread.sleep(10000);
        this.ptcShipping.click();
       // this.close.click();

    }

    public void stepPayment() {
        this.selectPayByCheque.click();
        this.selectOrderConfirmation.click();
    }

    public String getConfirmation() {
        String text = this.orderConfirmatioText.getText();
        return text;
    }

    public String checkoutSignInPage() {
        String ckutSignIn = this.emailAddressText.getText();
        return this.checkoutSignInPage();
    }

    public String getCartInfo() {
        String cart = this.cartinfo.getText();
        return cart;
    }


}
