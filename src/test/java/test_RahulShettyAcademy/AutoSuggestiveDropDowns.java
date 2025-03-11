package test_RahulShettyAcademy;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class AutoSuggestiveDropDowns {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(StringConstants.flightBookingDropDowns);

        driver.findElement(By.id("autosuggest")).sendKeys("Am");

        Thread.sleep(3000);

        List<WebElement> options = driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] a"));

        for(WebElement option : options){
            if(option.getText().equalsIgnoreCase("Gambia")){
                option.click();
            }
        }

        driver.quit();





    }
}
