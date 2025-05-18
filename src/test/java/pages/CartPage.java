package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class CartPage extends BasePage {


    By cartItem = By.cssSelector(".sc-product-title");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getCartItemText() {
        return getText(cartItem);
    }
}