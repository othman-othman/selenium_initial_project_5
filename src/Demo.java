import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/Users/oats/IdeaProjects/selenium_initial_project_5/chromedriver");

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.google.com/");
    }
}
