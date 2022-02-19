package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VerifyCart {

    WebDriver driver;

    public VerifyCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(className = "nav-search-submit")
    WebElement searchIcon;

    @FindBy(partialLinkText = "Combo Daimoand Lumba RAKHI FOR BHABHI RAKSHABANDHAN SPECIAL PACK OF 3 Lumba Rakhi with Roli Chawal For bhabhi")
    WebElement searchOutput;

    @FindBy(id = "quantity")
    WebElement quantity;

    @FindBy(css = "add-to-cart-button")
    WebElement addToCartButton;

    public WebElement goToSearchBox() {
        return searchBox;
    }

    public WebElement clickSearchIcon() {
        return searchIcon;
    }

    public List<WebElement> findElementsOfRakhi() {
        List<WebElement> findElement = driver.findElements(By.cssSelector(".sg-col-4-of-12.s-result-item.s-asin.sg-col-4-of-16.sg-col.s-widget-spacing-small.sg-col-4-of-20"));
        return findElement;
    }

    public WebElement getSearchOutput() {
        return searchOutput;
    }

    public WebElement getQuantity() {
        return quantity;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }
}
