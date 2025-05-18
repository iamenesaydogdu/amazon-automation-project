package tests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;
import utils.DriverFactory;

public class SearchProductTest extends DriverFactory {
    @Test
    public void searchProductAndClickFirst() {
        driver.get("https://www.amazon.ca");
        HomePage home = new HomePage(driver);
        home.search("mouse");
        SearchResultsPage results = new SearchResultsPage(driver);
        results.clickFirstResult();
    }
}