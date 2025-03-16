package test_RahulShettyAcademy;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

    public static String xPath(String value){
            String xPath = "//label[text() = 'REPLACE']/following-sibling::input";
            return xPath.replace("REPLACE",value);
    }


    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(StringConstants.PractiseAngularPageRahulShetty);

        driver.findElement(By.xpath(xPath("Name"))).sendKeys("Lord Pandey");
        driver.findElement(By.xpath(xPath("Email"))).sendKeys("Lord Pandey");
        driver.findElement(By.xpath(xPath("Password"))).sendKeys("Lord Pandey");
        driver.findElement(By.id("exampleCheck1")).click();

        WebElement Gender = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropDown = new Select(Gender);
        dropDown.selectByVisibleText("Female");

        driver.findElement(By.xpath("//label[contains(text(),'Employed')]/preceding-sibling::input")).click();

        driver.findElement(By.xpath(xPath("Date of Birth"))).sendKeys("Lord Pandey");

        driver.findElement(By.className("btn-success")).click();

        System.out.println(driver.findElement(By.className("alert-dismissible")).getText());

        driver.close();
    }
}
