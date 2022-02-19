package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GetMobileDetails {
    WebDriver driver;

    public GetMobileDetails(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#nav-hamburger-menu")
    WebElement findAllMenu;

    @FindBy(partialLinkText = "Mobiles, Computers")
    WebElement getMobilesSection;

    @FindBy(partialLinkText = "All Mobile Phones")
    WebElement getAllMobilePhone;

    public WebElement getFindAllMenu() {
        return findAllMenu;
    }

    public WebElement getGetMobilesSection() {
        return getMobilesSection;
    }

    public WebElement getGetAllMobilePhone() {
        return getAllMobilePhone;
    }

    public List<WebElement> findMobileList() {
        List<WebElement> mobileList = driver.findElements(By.cssSelector(".s-result-item.s-asin.sg-col-0-of-12.sg-col-16-of-20.sg-col.s-widget-spacing-small.sg-col-12-of-16"));
        return mobileList;
    }
}
