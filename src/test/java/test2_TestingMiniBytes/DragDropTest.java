package test2_TestingMiniBytes;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class DragDropTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(StringConstants.JqueryUrl);
        driver.findElement(By.xpath(StringConstants.xPath("Droppable", "byText"))).click();
        Actions action = new Actions(driver);

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        WebElement draggAble = driver.findElement(By.id("draggable"));
        WebElement droppAble = driver.findElement(By.id("droppable"));

        //action.clickAndHold(draggAble).moveToElement(droppAble).release().build().perform(); //oldMethod
        action
                .dragAndDrop(draggAble,droppAble)
                .build()
                .perform(); //single line method

        driver.switchTo().defaultContent();
        driver.findElement(By.xpath(StringConstants.xPath("Resizable","byText"))).click();
        driver.quit();
    }
}