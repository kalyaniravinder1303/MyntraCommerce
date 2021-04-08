package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyntraRegistrationPage {
    public MyntraRegistrationPage(WebDriver driver){
        PageFactory.initElements(driver,this);}

    @FindBy(id = "id_gender2")
    public WebElement newUserTitleRadioButton;
    @FindBy(id = "customer_firstname")
    public WebElement newUserFirstName;
    @FindBy(id = "customer_lastname")
    public WebElement newUserLastName;
    @FindBy(id = "email")
    public WebElement newUserEmailIDTextBox;
    @FindBy(id = "passwd")
    public WebElement newUserPasswordTextBox;
    @FindBy(name = "firstname")
    public WebElement newUserAddressFisrtNameTextBox;
    @FindBy(name = "lastname")
    public WebElement newUserAddressLastNameTextBox;
    @FindBy(css = "#address1")
    public WebElement AddressTextBox;
    @FindBy(css = "#city")
    public WebElement cityTextBox;
    @FindBy(css = "#id_state")
    public WebElement selectStateTextBox;
    @FindBy(css = "#postcode")
    public WebElement postCodeTextBox;
    @FindBy(id = "id_country")
    public WebElement countryTextBox;
    @FindBy(css = "#phone_mobile")
    public WebElement mobileNumberTextBox;
    @FindBy(css = "button[id='submitAccount'] span")
    public WebElement registerButton;
    @FindBy(xpath = "//h3[normalize-space()='Your personal information']")
    public WebElement registrationPage;
    @FindBy(className = "page-heading")
    public WebElement myAccountHeading;

    public void registrationDetails(){
        newUserTitleRadioButton.click();
        newUserFirstName.sendKeys("hfjjssd");
        newUserLastName.sendKeys("iueyru");
        newUserPasswordTextBox.sendKeys("76271382117");
        newUserAddressFisrtNameTextBox.sendKeys("sdjfsj");
        newUserAddressLastNameTextBox.sendKeys("gddhuais");
        AddressTextBox.sendKeys("1-10-10/10");
        cityTextBox.sendKeys("ameerpet");
        selectStateTextBox.sendKeys("Indiana");
        postCodeTextBox.sendKeys("00000");
        countryTextBox.click();
        mobileNumberTextBox.sendKeys("8789798935");
        registerButton.click();}

    public String registrationConfirmation(){
        String text = registrationPage.getText();
        return text;
    }
}
