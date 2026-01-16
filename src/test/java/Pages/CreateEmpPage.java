package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateEmpPage {
    private WebDriver driver ;

    public CreateEmpPage(WebDriver driver ){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "Name")
    private WebElement name;

    @FindBy(id = "Salary")
    private WebElement Salary;

    @FindBy(id = "DurationWorked")
    private WebElement DurationWorked ;

    @FindBy(id = "Grade")
    public  WebElement gradeSelector;

    @FindBy(id = "Email")
    private WebElement Email;

    @FindBy(css = ".btn")
    private WebElement createBtn ;

    public EmployeeListPage createEmployee(String empName, String salary, String Duration, String email , String visibleText ){
        name.sendKeys(empName);
        Salary.sendKeys(salary);
        DurationWorked.sendKeys(Duration);
        selectOptionsByVisibleText(gradeSelector, visibleText);
        Email.sendKeys(email);
        createBtn.click();
        return  new EmployeeListPage(driver);
    }

    public void selectOptionsByVisibleText(WebElement locator, String visibleText){
        new Select(locator).selectByVisibleText(visibleText);
    }

}
