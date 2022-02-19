package sampleDemo;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class SeleniumGridExample {
    public static void main(String[] args) throws MalformedURLException {
// TODO Auto-generated method stub
//Automated- chrome,firefox,ie,safari

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");
        dc.setPlatform(Platform.LINUX);
//dc.se

//Webdriver driver=new ChromeDriver();
        URL url = new URL("http://localhost:4444/wd/hub");
        WebDriver driver = new RemoteWebDriver(url, dc);
        driver.get("https://www.google.com/");

    }
}
