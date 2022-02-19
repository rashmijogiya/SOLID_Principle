package sampleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WIndowHandles {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/rashmj/Downloads/chromedriver/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

        driver.findElement(By.cssSelector(".blinkingText")).click();

        Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

        Iterator<String> itr = windows.iterator();

        String parentId = itr.next();

        String childId = itr.next();

        driver.switchTo().window(childId);
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".im-para.red")).getText();

        String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

        driver.switchTo().window(parentId);

        driver.findElement(By.id("username")).sendKeys(emailId);

    }
}
