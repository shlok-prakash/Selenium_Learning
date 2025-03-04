package test_RahulShettyAcademy;

import constants.StringConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(StringConstants.AutomationPracticeRahulShetty);

        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

        ////header/div/button[1]/parent::div/preceding-sibling::a
        /*
            Ancestor: Selects the current node’s ancestor nodes (except the node itself). E.g //p/ancestor::div selects all div elements that are ancestors of p.
            Ancestor-or-self: Selects all ancestors of the current node, including the node itself. Example: //p/ancestor-or-self::div selects the div element itself and all its ancestor div elements.
            Attribute: Selects attributes of the current node. //input/attribute::type selects the type attribute of input elements.
            Child: Selects all child nodes of the current node. Example: //div/child::* selects all child elements of div
            Descendant: Selects all descendant nodes (children, grandchildren, etc.) of the current node. Example, //div/descendant-or-self::span selects the span elements inside div, as well as div itself if it is a span.
            Following: Selects all nodes that come after the current node in the document, excluding any descendants. Example. //h2/following::p selects all p elements that follow an h2 element.
            Following-sibling: Selects all siblings that come after the current node. //h2/following-sibling::p selects all p elements that are siblings following an h2.
            Namespace: Selects namespace nodes of the current node. Example, //element/namespace::* selects all namespace nodes for the element.
            Parent: Selects the parent node of the current node. //p/parent::div selects the div parent of a p element.
            Preceding: Selects all nodes that come before the current node in the document, excluding any ancestors. Example. //p/preceding::h2 selects all h2 elements that precede p.
            Preceding-sibling: Selects all siblings that come before the current node. //p/preceding-sibling::h2 selects all h2 elements that are siblings preceding p.
            Self: Selects the current node itself. //div/self::div selects the div element itself.

         */
        driver.close();


    }
}
