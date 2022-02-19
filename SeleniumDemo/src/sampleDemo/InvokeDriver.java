package sampleDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeDriver {
    public static void main(String[] args) {
        System.out.println("Hello world");
//      Middle man proxy to invoke Chrome browser. (If it is Firefox browser then we need to invoke firefox driver)
//        System.setProperty(Key, value);
//        This is to access chrome driver
        System.setProperty("webdriver.chrome.driver", "/home/rashmj/Downloads/chromedriver/chromedriver");

//        This is to access firefox driver
//        System.setProperty("webdriver.gecko.driver", "path of firefox driver");
//        WebDriver driver= new FirefoxDriver();

        //Microsoft Edge
//        System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");
//        WebDriver driver2 = new EdgeDriver();

//       Invoke Browser
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.google.com");
        driver.quit();
    }
}
