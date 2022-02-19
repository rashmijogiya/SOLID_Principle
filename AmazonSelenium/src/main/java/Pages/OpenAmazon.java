package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OpenAmazon {
    WebDriver driver;

    public OpenAmazon(WebDriver driver) {
        // TODO Auto-generated constructor stub
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "#sf-all-price")
    WebElement filterForAllPrice;


    public WebElement getFilterForAllPrice() {
        return filterForAllPrice;
    }

}
