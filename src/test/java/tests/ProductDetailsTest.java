package tests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;
import utils.DriverFactory;

public class ProductDetailsTest extends DriverFactory {
    @Test
    public void productDetailTest() {
        driver.get("https://www.amazon.ca");
        HomePage home = new HomePage(driver);
        home.search("monitor");
        SearchResultsPage result = new SearchResultsPage(driver);
        result.clickFirstResult();
        ProductPage product = new ProductPage(driver);
        product.addToCart();
    }
}