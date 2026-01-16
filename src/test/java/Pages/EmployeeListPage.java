package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage {
    private WebDriver driver ;

    public EmployeeListPage(WebDriver driver ){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    private By createNewLink = By.linkText("Create New");

    public CreateEmpPage clickOnCreateEmp(){
        driver.findElement(createNewLink).click();
        return new CreateEmpPage(driver);
    }
}
