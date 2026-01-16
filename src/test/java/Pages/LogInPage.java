package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    private WebDriver driver ;

    public LogInPage(WebDriver driver ){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    // locators for login page
    @FindBy(id = "UserName")
    private WebElement username;

    @FindBy(id = "Password")
    private WebElement password;

    @FindBy(id = "RememberMe")
    private WebElement checkBox;

    @FindBy(id = "loginIn")
    private  WebElement loginBtn;

    public HomePage performLogin(String username1 , String password1){
//        driver.findElement(username).sendKeys(username1);
        username.sendKeys(username1);
//        driver.findElement(password).sendKeys(password1);
        password.sendKeys(password1);
//        driver.findElement(checkBox).click();
        checkBox.click();
//        driver.findElement(loginBtn).click();
        loginBtn.click();
        return  new HomePage(driver);
    }

}
