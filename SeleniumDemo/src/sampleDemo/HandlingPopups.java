package sampleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopups {

    public static void main(String[] args) throws InterruptedException {
String nameStr="Rashmi";
        System.setProperty("webdriver.chrome.driver", "/home/rashmj/Downloads/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("name")).sendKeys(nameStr);
        driver.findElement(By.id("alertbtn")).click();
//        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("name")).sendKeys(nameStr);
        driver.findElement(By.id("confirmbtn")).click();
//        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();


    }
}
