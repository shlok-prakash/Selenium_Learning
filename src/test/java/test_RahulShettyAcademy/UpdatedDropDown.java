package test_RahulShettyAcademy;

import constants.StringConstants;
import java.util.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(StringConstants.flightBookingDropDowns);

            System.out.println(driver.findElement(By.xpath("//input[contains(@id,'IndArm')]")).isSelected());

        Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@id,'IndArm')]")).isSelected());

        driver.findElement(By.xpath("//input[contains(@id,'IndArm')]")).click();

        System.out.println(driver.findElement(By.xpath("//input[contains(@id,'IndArm')]")).isSelected());

        Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'IndArm')]")).isSelected());

        //count the Number Of Checkboxes

        System.out.println(driver.findElements(By.xpath("//input[@type = 'checkbox']")).size());

        List<WebElement> options = driver.findElements(By.xpath("//input[@type = 'checkbox']//following-sibling::*"));

        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        System.out.println(driver.findElement(By.id("Div1")).getDomProperty("style"));
        if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")){
            System.out.println("is Enabled");
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }


        for(WebElement option : options){
            System.out.println(option.getText());
        }



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

        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult, 2 Child" );

        driver.quit();

    }
}
