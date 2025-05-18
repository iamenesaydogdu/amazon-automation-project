package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.DriverFactory;

public class AddToCartTest extends DriverFactory {
    @Test
    public void addProductToCart() {
        driver.get("https://www.amazon.ca");
        HomePage home = new HomePage(driver);
        home.search("book");
        SearchResultsPage result = new SearchResultsPage(driver);
        result.clickFirstResult();
        ProductPage product = new ProductPage(driver);
        product.addToCart();
        driver.get("https://www.amazon.ca/gp/cart/view.html");
        CartPage cart = new CartPage(driver);
        Assert.assertTrue(cart.getCartItemText().length() > 0);
    }
}