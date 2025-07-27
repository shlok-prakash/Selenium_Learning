package test_RahulShettyAcademy;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(StringConstants.Amazon);

        Actions action = new Actions(driver);

        WebElement move = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

        action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click()
                        .keyDown(Keys.SHIFT).sendKeys("hello")
                        .doubleClick().build().perform();

        action.moveToElement(move).contextClick().build().perform();
        driver.quit();





    }
}
