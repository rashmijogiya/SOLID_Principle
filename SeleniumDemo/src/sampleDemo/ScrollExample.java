package sampleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ScrollExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/rashmj/Downloads/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor ex = (JavascriptExecutor) driver;
        ex.executeScript("window.scrollBy(0,600)");
        Thread.sleep(3000);
        ex.executeScript("document.querySelector('.tableFixHead').scroll(0,500)");

        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum = sum + Integer.parseInt(values.get(i).getText());
        }
        System.out.println(sum);
        String[] sumContent = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":");
        sumContent[1].trim();
        int actualResult = Integer.parseInt(sumContent[1].trim());
        if (sum == actualResult) {
            System.out.println(" actual result match");
        } else {
            System.out.println(" actual result doesn't match");
        }
    }
}
