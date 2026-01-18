package actionClassesExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDropOp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/droppable");
        Actions action = new Actions(driver);
        WebElement sourceEle = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement targetEle = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        action.dragAndDrop(sourceEle,targetEle).perform();
    }
}
