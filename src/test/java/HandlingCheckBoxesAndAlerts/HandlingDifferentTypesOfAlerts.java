package HandlingCheckBoxesAndAlerts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingDifferentTypesOfAlerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        // alert
        WebElement alertButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
        alertButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        // confirmation
        WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        confirmButton.click();
        Alert confirm = driver.switchTo().alert();
        System.out.println(confirm.getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("accept");
        confirm.accept();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement confirmButton1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        confirmButton1.click();
        Alert confirm1 = driver.switchTo().alert();
        System.out.println(confirm1.getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("cancel");
        confirm1.dismiss();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // prompt alert
        WebElement promptButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        promptButton.click();
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("hello its aditya");
        System.out.println(prompt.getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        prompt.accept();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // explicit wait alert handling without sendTo()
        WebElement alertButton1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
        alertButton1.click();
        Alert exAlert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Alert is explicitly handled ");
        exAlert.accept();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().newWindow(WindowType.TAB).get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


    }
}
