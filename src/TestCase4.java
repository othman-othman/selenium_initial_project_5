import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class TestCase4 {
    public static void main(String[] args) {
    /*
    Test Case 4: Validate Automation Exercise site footer
    Given user navigates to “https://automationexercise.com/”
    Then user should see “Copyright © 2021 All rights reserved” text in the footer
     */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com");

        System.out.println(driver.findElement(By.cssSelector("p[class=\"pull-left\"]")).getText()
                .equals("Copyright © 2021 All rights reserved") ?
                "Text is Correct" : "Text is Not Correct");

        driver.quit();
    }
}
