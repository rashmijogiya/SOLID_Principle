package sampleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorPractice {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/rashmj/Downloads/chromedriver/chromedriver");
        WebDriver driver= new ChromeDriver();
//        implicit wait timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // it is used for something to show
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Rashmi");
        driver.findElement(By.name("inputPassword")).sendKeys("hello1234");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000); // Thread or explicit wait is used for something to get in a stable state.
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rashmi");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rashmi@123.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("rashmi@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9860723662");
        driver.findElement(By.className("reset-pwd-btn")).click();
        System.out.println( driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rashmi");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); // regular expression css selector
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.name("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); //regular expression
    }
}
