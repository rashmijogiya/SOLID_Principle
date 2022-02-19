package sampleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ECommerceAppPractice {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/rashmj/Downloads/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
//        implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        String[] itemsToBeAdded = {"Cucumber", "Potato", "Musk Melon", "Pomegranate"};
        addItems(driver, itemsToBeAdded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        //explicit wait

        WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(5));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
    }

     public static void addItems(WebDriver driver, String[] itemsToBeAdded) throws InterruptedException {
        Thread.sleep(3000);
         int j = 0;
        List<WebElement> productsList=driver.findElements(By.cssSelector("h4.product-name"));
        for(int i=0; i<productsList.size(); i++ ){
          String[] productName=  productsList.get(i).getText().split("-");
          String formattedName=productName[0].trim();
            System.out.println( formattedName);
          List itemsList= Arrays.asList(itemsToBeAdded);
            System.out.println(itemsList);
          if(itemsList.contains(formattedName)){
              j++;
              driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//              driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
              if(j==itemsToBeAdded.length){
                  break;
              }
          }
        }
    }
}
