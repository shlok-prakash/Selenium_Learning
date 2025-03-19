package test_RahulShettyAcademy;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class KiranaKart {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));


        String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};

        driver.get(StringConstants.greenKartRahulShetty);
        addItems(driver,itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//div/button[text()='PROCEED TO CHECKOUT']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
        driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");

        driver.findElement(By.cssSelector("button.promoBtn")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());



        //Thread.sleep(10);
        //driver.close();



    }



    public static  void addItems(WebDriver driver,String[] itemsNeeded){
        int j=0;
        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

        for(int i=0;i<products.size();i++){
            String[] name=products.get(i).getText().split("-");
            String formattedName=name[0].trim();
            List<String> itemsNeededList = Arrays.asList(itemsNeeded);

            if(itemsNeededList.contains(formattedName)){
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); //click on Add to cart
                if(j==itemsNeeded.length){
                    break;
                }
            }
        }
    }
                             //format it to get actual vegetable name
                            // convert array into array list for easy search
                           //  check whether name you extracted is present in arrayList or not-


}