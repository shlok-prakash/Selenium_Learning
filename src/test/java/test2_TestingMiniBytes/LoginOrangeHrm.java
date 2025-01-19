package test2_TestingMiniBytes;

import constants.StringConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginOrangeHrm {
    public void LoginHrm(WebDriver driver){
        driver.get(StringConstants.orangeHrmLoginUrl);
        driver.findElement(By.xpath(StringConstants.xPath("Username", "xPath"))).sendKeys("Admin");
        driver.findElement(By.xpath(StringConstants.xPath("Password","xPath"))).sendKeys("admin123");
        driver.findElement(By.cssSelector(".orangehrm-login-button")).click();
    }
}
