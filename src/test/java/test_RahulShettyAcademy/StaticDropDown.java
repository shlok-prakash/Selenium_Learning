package test_RahulShettyAcademy;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(StringConstants.flightBookingDropDowns);

        WebElement element = driver.findElement(By.xpath("//*[@name = 'ctl00$mainContent$DropDownListCurrency']"));

        Select dropDown = new Select(element);
        dropDown.selectByIndex(1);
        System.out.println((dropDown.getFirstSelectedOption().getText()));

        dropDown.selectByValue("USD");
        System.out.println((dropDown.getFirstSelectedOption().getText()));

        dropDown.selectByVisibleText("AED");
        System.out.println((dropDown.getFirstSelectedOption().getText()));

        driver.quit();
    }
}
