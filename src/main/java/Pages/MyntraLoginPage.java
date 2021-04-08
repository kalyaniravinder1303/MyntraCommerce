package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class MyntraLoginPage {
    public MyntraLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "email")
    public WebElement emailTextBox;
    @FindBy(id = "passwd")
    public WebElement passwordTextBox;
    @FindBy(css = "button[id='SubmitLogin'] span")
    public WebElement signInButton;
    @FindBy(id = "email_create")
    public WebElement newuserEmailId;
    @FindBy(css = "button[id='SubmitCreate'] span")
    public WebElement createAnAccountButton;
    @FindBy(className = "page-heading")
    public WebElement myAccountHeading;

    public void loginCredentials() {
        emailTextBox.sendKeys("kalyaniravinder@gmail.com");
        passwordTextBox.sendKeys("123456");
        signInButton.click();
    }

    public String registrationText() {
        return myAccountHeading.getText();
    }

    public void randomStringGeneratorForNewUser() {

        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder(20);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        System.out.println(output);
        newuserEmailId.sendKeys(output+ "@yahoo.com");
        createAnAccountButton.click();}

}


