package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class MyntraHomePage {
    public MyntraHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "login")
    public WebElement signInButton;
    @FindBy(id = "search_query_top")
    public WebElement searchBox;
    @FindBy(xpath = "//button[@name='submit_search']")
    public WebElement searchButton;
    @FindBy(className = "heading-counter")
    public WebElement resultCount;

    public void sendSearchKey(String searchValue){
        searchBox.clear();
        searchBox.sendKeys(searchValue);
        searchButton.click();}

    public void clickSignIn(){
        signInButton.click();
    }

    public String searchCount(){
        String result = resultCount.getText();
        return result; }
    }


