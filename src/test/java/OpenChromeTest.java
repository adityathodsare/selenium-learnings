import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeTest {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // Selenium Manager handles driver
        driver.manage().window().maximize();

        // Optional: open blank page
        driver.get("https://safev.vercel.app");

        // Close browser
    }
}
