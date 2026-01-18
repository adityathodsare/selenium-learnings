package HandlingCheckBoxesAndAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HandlingCheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        // single element
//        driver.findElement(By.xpath("//*[@id=\"sunday\"]")).click();
        // all checkboxes
        List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//*[@class='form-check-input'and @type='checkbox']"));
        for (WebElement ele : allCheckBoxes){
            ele.click();
        }
        //uncheck all
        for (WebElement ele : allCheckBoxes){
            ele.click();
        }
        // last 3 checkboxes
        for (int i = allCheckBoxes.size()-3; i<allCheckBoxes.size(); i++){
            allCheckBoxes.get(i).click();
        }
        // first 3 checkboxes
        for (int i =0; i<3; i++) {
            allCheckBoxes.get(i).click();
        }

        for (WebElement checkbox : allCheckBoxes){
            if (checkbox.isSelected()){
                checkbox.click();
            }else {
                continue;
            }
        }

    }
}
