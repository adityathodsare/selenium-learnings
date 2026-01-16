package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
    private WebDriver driver ;

    public LogInPage(WebDriver driver ){
        this.driver=driver;
    }
    // locators for login page
    private By username = By.id("UserName");
    private By password = By.id("Password");
    private By checkBox = By.id("RememberMe");
    private  By loginBtn = By.id("loginIn");

    public HomePage performLogin(String username1 , String password1){
        driver.findElement(username).sendKeys(username1);
        driver.findElement(password).sendKeys(password1);
        driver.findElement(checkBox).click();
        driver.findElement(loginBtn).click();
        return  new HomePage(driver);
    }

}
