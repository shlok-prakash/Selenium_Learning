package test2_TestingMiniBytes;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionsTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new LoginOrangeHrm().LoginHrm(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Actions actions = new Actions(driver);

        WebElement leave = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(StringConstants.xPath("Leave", "byText"))));
        actions.click(leave).build().perform();

        WebElement entitlements = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(StringConstants.xPath("Entitlements ", "byText"))));
        actions.click(entitlements).build().perform();

        WebElement addEntitlements = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(StringConstants.xPath("Add Entitlements", "byText"))));
        actions.click(addEntitlements).build().perform();

        driver.quit();
    }
}
