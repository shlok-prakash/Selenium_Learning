package test2_TestingMiniBytes;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class FileUploadTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(StringConstants.fileUploadUrl);
        WebElement fileUpload = driver.findElement(By.id("input-4"));
        fileUpload.sendKeys(System.getProperty("user.dir")+"/testFile.txt");

        //Thread.sleep(5000);
        driver.quit();


    }
}
