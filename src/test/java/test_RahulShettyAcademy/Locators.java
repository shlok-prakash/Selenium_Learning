package test_RahulShettyAcademy;

import constants.StringConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //this is applicable for all the lines in the code



        driver.get(StringConstants.locatorsUrl);
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");

        driver.findElement(By.name("inputPassword")).sendKeys("Lord");

        driver.findElement(By.className("submit")).click();

        String errText = driver.findElement(By.cssSelector("p.error")).getText();

        System.out.println(errText);

        driver.findElement(By.linkText("Forgot your password?")).click();

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Abcdf@rsa.com");

        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("abdsfs@gmail.com");

        driver.findElement(By.xpath("//form/input[3]")).sendKeys("78764654310");

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();



        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        String password = passWordExtract(driver.findElement(By.cssSelector("form p")).getText());
        System.out.println(password);


        driver.findElement(By.xpath("//div[@class = 'forgot-pwd-btn-conainer']/button[1]")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("John");

        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);

        driver.findElement(By.id("chkboxOne")).click();

        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

        driver.close();
    }
    public static String passWordExtract(String password){

        String[] passwordArray  = password.split("'");
        return passwordArray[1].split("'")[0];

        /*
        0th index - Please use temporary password
        1st index - rahulshettyacademy' to Login.

        0th index - rahulshettyacademy
        1st index - to Login.
         */

    }
}
