package test_RahulShettyAcademy;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(StringConstants.herokuappUrl);

        driver.findElement(By.xpath(StringConstants.xPath("Dynamic Loading","byText"))).click();
        driver.findElement(By.xpath(StringConstants.xPath("Example 1: Element on page that is hidden","byText"))).click();
        driver.findElement(By.xpath(StringConstants.xPath("Start","byText"))).click();

        

//        driver.quit();

    }
}
