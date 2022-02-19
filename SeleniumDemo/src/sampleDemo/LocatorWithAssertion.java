package sampleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LocatorWithAssertion {

    public static void main(String[] args) throws InterruptedException {
        String name="Rashmi";
        System.setProperty("webdriver.chrome.driver", "/home/rashmj/Downloads/chromedriver/chromedriver");
        WebDriver driver= new ChromeDriver();
//        implicit wait timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // it is used for something to show
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals((driver.findElement(By.tagName("h2")).getText()), "Hello "+name+ ",");

    }
}
