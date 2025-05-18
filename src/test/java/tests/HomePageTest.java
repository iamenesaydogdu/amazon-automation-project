package tests;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.DriverFactory;

public class HomePageTest extends DriverFactory {
    @Test
    public void openAmazonHome() {
        driver.get("https://www.amazon.ca");
        HomePage home = new HomePage(driver);
        home.search("keyboard");
    }
}