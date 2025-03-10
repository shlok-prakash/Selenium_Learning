package test_RahulShettyAcademy;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(StringConstants.flightBookingDropDowns);

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Goa");

        Thread.sleep(2000);

        //driver.findElement(By.xpath("(//a[@text = 'Chennai (MAA)'])[2]")).click();
        driver.findElement(By.xpath("//div[@id= 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value= 'MAA']")).click();

        driver.quit();

    }
}
