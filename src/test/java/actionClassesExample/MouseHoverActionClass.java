package actionClassesExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MouseHoverActionClass {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By xPath_accountAndList = By.xpath("//*[@id='nav-link-accountList']/a");
//        By xPath_recommendations = By.xpath("//*[@id=\"nav-al-your-account\"]/ul/li[5]/a/span");
        //div[@class='nav-al-column nav-template nav-flyout-content nav-tpl-itemList nav-flyout-accessibility']//span[text()='Recommendations']

        By xPath_recommendations = By.xpath("//div[@class='nav-al-column nav-template nav-flyout-content nav-tpl-itemList nav-flyout-accessibility']//span[text()='Your Recommendations']");

        WebElement account = wait.until(
                ExpectedConditions.visibilityOfElementLocated(xPath_accountAndList)
        );

        Actions actions = new Actions(driver);
        actions.moveToElement(account).perform();

        WebElement rec = wait.until(
                ExpectedConditions.elementToBeClickable(xPath_recommendations)
        );

        rec.click();
    }
}
