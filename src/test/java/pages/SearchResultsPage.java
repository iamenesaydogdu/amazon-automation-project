package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class SearchResultsPage extends BasePage {
    By firstProduct = By.cssSelector("div.s-main-slot div[data-index='1'] h2 a");

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstResult() {
        click(firstProduct);
    }
}