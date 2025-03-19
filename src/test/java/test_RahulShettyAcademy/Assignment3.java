package test_RahulShettyAcademy;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Assignment3 {

    public static String xPathLogin(String value){
        String xPath = "//input[@name='REPLACE']";
        return xPath.replace("REPLACE",value);
    }

    public static String cartAddition(String value){
        String xPath = "//a[contains(text(),'REPLACE')]/../../following-sibling::div/button[@class='btn btn-info']";
        return xPath.replace("REPLACE",value);
    }

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        driver.get(StringConstants.loginPracticeRahulShetty);

        driver.findElement(By.xpath(xPathLogin("username"))).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath(xPathLogin("password"))).sendKeys("learning");

        driver.findElement(By.xpath("//*[text()=' User']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn-success")));
        driver.findElement(By.cssSelector("button.btn-success")).click();

        WebElement selectDropDown = driver.findElement(By.cssSelector("select.form-control"));
        Select dropDown = new Select(selectDropDown);
        dropDown.selectByVisibleText("Consultant");

        driver.findElement(By.id("terms")).click();

        driver.findElement(By.id("signInBtn")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/a[@class='navbar-brand']")));
        System.out.println(driver.findElement(By.xpath("//div/a[@class='navbar-brand']")).getText());

        List<WebElement> elements = driver.findElements(By.cssSelector("h4.card-title"));

        for(WebElement element : elements){
            String productName = element.getText();
            System.out.println(productName);
            driver.findElement(By.xpath(cartAddition(productName))).click();
        }

        driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();

        driver.quit();

    }
}
