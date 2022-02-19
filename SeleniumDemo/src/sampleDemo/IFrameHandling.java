package sampleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IFrameHandling {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/rashmj/Downloads/chromedriver/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
//        driver.findElement(By.id("draggable")).click();

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        Actions a= new Actions(driver);
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));
        a.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent();
    }
}
