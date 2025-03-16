package test_RahulShettyAcademy;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(StringConstants.PractisePageRahulShetty);

        //(1.)   Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
        //Checked
        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());

        //UnChecked
        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());

        //(2.)   How to get the Count of number of check boxes present in the page
        System.out.println("There are " +driver.findElements(By.xpath("//input[@type='checkbox']")).size()+ " checkBoxes in the Page");

        driver.quit();


    }
}
