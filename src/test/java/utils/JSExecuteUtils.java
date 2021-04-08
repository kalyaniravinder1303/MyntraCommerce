package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSExecuteUtils {

    public JSExecuteUtils(){

    }

    public static void clickUsingJSExecute(WebDriver driver, WebElement element, String script){
        try {
            element.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript(script, element);
        }
    }
}
