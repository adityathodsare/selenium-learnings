package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateEmpPage {
    private WebDriver driver ;

    public CreateEmpPage(WebDriver driver ){
        this.driver=driver;
    }
    private By name = By.id("Name");
    private By Salary = By.id("Salary");
    private By DurationWorked = By.id("DurationWorked");
    public  By gradeSelector = By.id("Grade");
    private By Email = By.id("Email");
    private By createBtn = By.cssSelector(".btn");

    public EmployeeListPage createEmployee(String empName, String salary, String Duration, String email , String visibleText ){
        driver.findElement(name).sendKeys(empName);
        driver.findElement(Salary).sendKeys(salary);
        driver.findElement(DurationWorked).sendKeys(Duration);
        selectOptionsByVisibleText(gradeSelector, visibleText);
        driver.findElement(Email).sendKeys(email);
        driver.findElement(createBtn).click();
        return  new EmployeeListPage(driver);
    }

    public void selectOptionsByVisibleText(By locator, String visibleText){
        new Select(driver.findElement(locator)).selectByVisibleText(visibleText);
    }

}
