import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {

        /*
        Test Case 2: Validate Automation Exercise site header items
        Given user navigates to “https://automationexercise.com/”
        Then validate all below header items are displayed and enabled and their text is as below
        Home
        Products
        Cart
        Signup / Login
        Test Cases
        API Testing
        Video Tutorials
        Contact us
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com");

        List<WebElement> items = driver.findElements(By.cssSelector(".col-sm-8 a"));
        for (WebElement item : items){
            System.out.println(item.getText());
            System.out.println(item.isDisplayed());
            System.out.println(item.isEnabled());
        }
        driver.quit();
    }
}
