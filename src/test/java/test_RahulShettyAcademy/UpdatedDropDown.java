package test_RahulShettyAcademy;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(StringConstants.flightBookingDropDowns);

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(3000);


        for(int i=1; i<5; i++) {//adult
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        for(int i=0; i<2; i++) {//child
            driver.findElement(By.id("hrefIncChd")).click();
        }

        driver.findElement(By.cssSelector("input#btnclosepaxoption")).click();

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.close();





    }
}
