package test_RahulShettyAcademy;

import constants.StringConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //this is applicable for all the lines in the code


        driver.get(StringConstants.locatorsUrl);
        String name = "Lord Pandey";
        driver.findElement(By.id("inputUsername")).sendKeys(name);


        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

        driver.findElement(By.id("chkboxOne")).click();

        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")));

        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class = 'login-container'] h2")).getText(),"Hello "+name+",");

        driver.findElement(By.xpath(StringConstants.xPath("Log Out","byText"))).click();

        driver.close();
    }
}
