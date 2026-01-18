package actionClassesExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class rightClickAction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        Actions actions = new Actions(driver);
        ///html/body/div/section/div/div/div/p/span
        By rightClick = By.xpath("//p/span[@class='context-menu-one btn btn-neutral']");
        By clickCut = By.xpath("//ul[@class='context-menu-list context-menu-root']//child::li[@class='context-menu-item context-menu-icon context-menu-icon-cut']");
        actions.contextClick(driver.findElement(rightClick)).perform();
        actions.contextClick(driver.findElement(clickCut)).perform();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        //driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']//child::li[@class='context-menu-item context-menu-icon context-menu-icon-cut context-menu-visible']")).click();


        // double click
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.switchTo().newWindow(WindowType.TAB).get("https://simplecounter.app/");
        WebElement reset = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='reset-button']"))));
        reset.click();
        actions.click(driver.findElement(By.xpath("//button[@id='reset-confirm-button']"))).perform();
        Thread.sleep(2000);
        WebElement add = driver.findElement(By.xpath("//button[@id='add-button']"));
        actions.doubleClick(add).perform();



    }
}
