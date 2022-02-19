package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodaysDeal {

    WebDriver driver;

    public TodaysDeal(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Today's Deals")
    WebElement todaysDeal;

    @FindBy(css = "[data-testid=grid-deals-container] > :nth-child(3)")
    WebElement thirdElementOfTodaysDeal;

    public WebElement getTodaysDeal() {
        return todaysDeal;
    }

    public WebElement getThirdElementOfTodaysDeal() {
        return thirdElementOfTodaysDeal;
    }
}
