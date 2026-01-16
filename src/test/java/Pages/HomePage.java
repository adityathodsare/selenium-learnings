package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver ;

    public HomePage(WebDriver driver ){
        this.driver=driver;
    }

    private By lnkLogin = By.linkText("Login");
    private By lnkEmpList = By.linkText("Employee List");

    public LogInPage clickOnLoginPage(){
        driver.findElement(lnkLogin).click();
        return  new LogInPage(driver);
    }

    public EmployeeListPage clickOnEmpList(){
        driver.findElement(lnkEmpList).click();
        return  new EmployeeListPage(driver);
    }

}
