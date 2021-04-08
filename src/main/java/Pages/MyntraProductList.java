package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyntraProductList {
    public MyntraProductList(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "selectProductSort")
    public WebElement sortByDropDown;
    @FindBy(css = "option[value='price:asc']")
    public WebElement lowestPrice;
    @FindBy(css = "img[title='Printed Chiffon Dress']")
    public WebElement selectProduct;
    @FindBy(className = "heading-counter")
    public WebElement resultCount;

    public String searchCount(){
        String result = resultCount.getText();
        return result; }

    public void selectSortByDropDown(){
        sortByDropDown.click();
        lowestPrice.click();
        selectProduct.click();
    }



}
