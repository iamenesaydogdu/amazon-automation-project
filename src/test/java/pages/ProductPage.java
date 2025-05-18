package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class ProductPage extends BasePage {
    By addToCartBtn = By.id("add-to-cart-button");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        click(addToCartBtn);
    }
}