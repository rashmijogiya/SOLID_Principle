package Application;

import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;


public class TestApplication {
    WebDriver driver;
    Properties Sitedata = new Properties();
    FileInputStream fi = new FileInputStream(System.getProperty("user.home") + "/IdeaProjects/AmazonSelenium/src/data.properties");

    public TestApplication() throws FileNotFoundException {
    }

    @Test(priority = 1)
    public void Login() throws InterruptedException, IOException {
        Sitedata.load(fi);
        String browserKey = Sitedata.getProperty("browser");
        System.out.println("browser key " + browserKey);
        System.setProperty("webdriver.chrome.driver", "/home/rashmj/Downloads/chromedriver/chromedriver");
         driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(Sitedata.getProperty("url"));
        //Mazimize current window
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    public void todaysDealMethod() {
        OpenAmazon openAmazon = new OpenAmazon(driver);
        TodaysDeal todaysDeal = new TodaysDeal(driver);
        todaysDeal.getTodaysDeal().click();
        todaysDeal.getThirdElementOfTodaysDeal().click();
    }

    @Test(priority = 3)
    public void verifyCartMethod() throws InterruptedException {

        VerifyCart verifyCart = new VerifyCart(driver);
        verifyCart.goToSearchBox().sendKeys(Sitedata.getProperty("searchText"));
        verifyCart.clickSearchIcon().click();

        List<WebElement> productList = verifyCart.findElementsOfRakhi();

        for (int i = 0; i < productList.size(); i++) {
            String productName = productList.get(i).getText();
            boolean productName1 = productName.contains(Sitedata.getProperty("productName"));
            if (productName1 == true) {
                Thread.sleep(3000);
                verifyCart.getSearchOutput().click();
                Set<String> windows = driver.getWindowHandles(); //[parentid,childid

                Iterator<String> itr = windows.iterator();

                String parentId = itr.next();

                String childId = itr.next();

                driver.switchTo().window(childId);
                Thread.sleep(15000);

                WebElement webElement = verifyCart.getQuantity();
                Select dropdown = new Select(webElement);
                String txt = dropdown.getFirstSelectedOption().getText();
                System.out.println("txt" + txt);
                if (Integer.parseInt(txt) < 2) {
                    dropdown.selectByValue("3");
                }
                driver.findElement(By.id("add-to-cart-button")).click();
//                verifyCart.getAddToCartButton();
                driver.switchTo().window(parentId);
                break;
            }
        }
////
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,0)");

        verifyCart.goToSearchBox().clear();
        verifyCart.goToSearchBox().sendKeys(Sitedata.getProperty("searchMobile"));
        verifyCart.clickSearchIcon().click();
    }

    @Test(priority = 4)
    public void getMobileDetailsMethod() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,6000)");

        GetMobileDetails getMobileDetails = new GetMobileDetails(driver);

        List<WebElement> mobileList = getMobileDetails.findMobileList();
        System.out.println("mobile list size " + mobileList.size());
        String mobileListStr = mobileList.get(mobileList.size() - 1).getText();
        System.out.println("Mobile list string " + mobileListStr);
        VerifyCart verifyCart = new VerifyCart(driver);
        verifyCart.goToSearchBox().clear();
        verifyCart.goToSearchBox().sendKeys(Sitedata.getProperty("searchMobile"));
        verifyCart.clickSearchIcon().click();

        getMobileDetails.getFindAllMenu().click();
        getMobileDetails.getGetMobilesSection().click();
        Thread.sleep(2000);
        getMobileDetails.getGetAllMobilePhone().click();
        Thread.sleep(2000);
        SelectCheckbox selectCheckbox = new SelectCheckbox(driver);
        selectCheckbox.getGetEligibleForFreeDelivery().click();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void accountRelatedMethod() throws InterruptedException {
        AccountRelated accountRelated = new AccountRelated(driver);

        accountRelated.getAmazonHomeLogo().click();
//
        accountRelated.getAccountLink().click();
        accountRelated.getEmailId().sendKeys(Sitedata.getProperty("userId"));
        accountRelated.getContinueButton().click();
        accountRelated.getPassword().sendKeys(Sitedata.getProperty("password"));
        accountRelated.getSignInButton().click();

        accountRelated.getAccountLink().click();
        accountRelated.getYourAccountCards().click();


        accountRelated.getOrderPlacedDropDown().click();
        Thread.sleep(2000);
        accountRelated.getDropDownOfYear().click();

        accountRelated.getAccountLink().click();
        accountRelated.getAddPaymentCard().click();

        Thread.sleep(3000);

        String cardDetails = accountRelated.getCardDetails().getText();
        System.out.println("Card details " + cardDetails);
        Assert.assertEquals(cardDetails, "ICICI Bank Debit Cardending in 3867\n" +
                "04/2023");

        accountRelated.getAccountLink().click();
        accountRelated.getAddAddressCard().click();
        Thread.sleep(2000);
        accountRelated.getAddNewAddress().click();
        accountRelated.getAddressFullName().clear();
        accountRelated.getAddressFullName().sendKeys(Sitedata.getProperty("addressFullName"));

        accountRelated.getAddressPhoneNo().clear();
        accountRelated.getAddressPhoneNo().sendKeys(Sitedata.getProperty("addressPhoneNo"));

        accountRelated.getAddressPinCode().clear();
        accountRelated.getAddressPinCode().sendKeys(Sitedata.getProperty("addressPinNo"));

        accountRelated.getAddressLine1().sendKeys(Sitedata.getProperty("addressLine1"));

        accountRelated.getAddressLine2().sendKeys(Sitedata.getProperty("addressLine2"));

        accountRelated.getAddressLandmark().sendKeys(Sitedata.getProperty("addressLandmark"));

        accountRelated.getAddressCity().clear();
        accountRelated.getAddressCity().sendKeys(Sitedata.getProperty("addressCity"));

        accountRelated.getAddressSaveButton().click();
        accountRelated.getAddressConfirmButton().click();

        String addressStr = accountRelated.getCompleteAddress().getText();
        System.out.println("completeAddress " + Sitedata.getProperty("completeAddress"));
        System.out.println(" address str " + addressStr);
        Assert.assertEquals(addressStr.trim(), Sitedata.getProperty("completeAddress").trim());
    }
}
