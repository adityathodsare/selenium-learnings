package testsPerformed;

import Pages.CreateEmpPage;
import Pages.EmployeeListPage;
import Pages.HomePage;
import Pages.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class performTest1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://eaapp.somee.com/");
        HomePage homePage = new HomePage(driver);
        LogInPage logInPage = homePage.clickOnLoginPage();
        logInPage.performLogin("admin", "password");
        EmployeeListPage employeeListPage= homePage.clickOnEmpList();
        CreateEmpPage createEmpPage = employeeListPage.clickOnCreateEmp();
        createEmpPage.createEmployee("aditya","23000","34","aditya@xyz.com","Middle");

        driver.close();

    }
}
