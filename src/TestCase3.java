import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class TestCase3 {
    public static void main(String[] args) {

        /*
        Test Case 3: Validate Automation Exercise site SUBSCRIPTION form
        Given user navigates to “https://automationexercise.com/”
        Then user should see heading2 as “SUBSCRIPTION”
        And user should see and email input box with “Your email address” placeholder
        And user should see arrow submit button
        And user should see “Get the most recent updates from our site and be updated your self...” text under the email input box
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com");

        System.out.println(driver.findElement(By.cssSelector(".single-widget h2")));

        System.out.println(driver.findElements(By.id("susbscribe_email")));

        System.out.println(driver.findElement(By.id("subscribe")));

        System.out.println(driver.findElement(By.cssSelector(".searchform p")));

        driver.quit();
    }
}
