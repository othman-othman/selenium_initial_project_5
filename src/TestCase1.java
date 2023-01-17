import org.openqa.selenium.By;
import utilities.Driver;
import org.openqa.selenium.WebDriver;

public class TestCase1 {
    public static void main(String[] args) {

        /*
        Test Case 1: Validate Automation Exercise site logo
        Given user navigates to “https://automationexercise.com/”
        Then user should see logo on top-left
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com");

        System.out.println(driver.findElement(By.xpath("//div/div/div/div/a/img")).isDisplayed());

        driver.quit();
    }
}
