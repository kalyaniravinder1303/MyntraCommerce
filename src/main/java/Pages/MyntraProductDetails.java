package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyntraProductDetails {
    public MyntraProductDetails(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "group_1")
    public WebElement productSize;
    @FindBy(css = "option[title='M']")
    public WebElement selectSize;
    @FindBy(xpath = "//a[@id='color_16']")
    public WebElement selectColor;
    @FindBy(css = "button[name='Submit'] span")
    public WebElement addToCart;
    @FindBy(xpath = "//label[normalize-space()='Model']")
    public WebElement productModel;

    public String productDisplayedWithDetails() {
    String proDetails = this.productModel.getText();
    return proDetails;
    }

    public void specifyProductDetails() {
        this.productSize.click();
        this.selectSize.click();
        this.selectColor.click();
        this.addToCart.click();
    }

}
