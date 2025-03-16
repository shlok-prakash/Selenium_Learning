package test_RahulShettyAcademy;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class e2e {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(StringConstants.flightBookingDropDowns);

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Goa");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id= 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value= 'MAA']")).click();

        if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")){
            System.out.println("its Enabled");
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }

        driver.findElement(By.xpath("//input[contains(@id,'IndArm')]")).click();

        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(3000);


        for(int i=1; i<5; i++) {//adult
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        for(int i=0; i<2; i++) {//child
            driver.findElement(By.id("hrefIncChd")).click();
        }


        WebElement element = driver.findElement(By.xpath("//*[@name = 'ctl00$mainContent$DropDownListCurrency']"));

        Select dropDown = new Select(element);
        dropDown.selectByIndex(1);
        System.out.println((dropDown.getFirstSelectedOption().getText()));

        driver.findElement(By.id("autosuggest")).sendKeys("Am");

        Thread.sleep(3000);

        List<WebElement> options = driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] a"));

        for(WebElement option : options){
            if(option.getText().equalsIgnoreCase("Gambia")){
                option.click();
            }
        }

        driver.findElement(By.cssSelector("input[type= 'submit']")).click();
        driver.quit();

    }
}
