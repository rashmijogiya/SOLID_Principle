import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class BaseClass {

public  static WebDriver driver;

public static void initilization(){
    System.setProperty("webdriver.chrome.driver", "/home/rashmj/Downloads/chromedriver/chromedriver");
    driver = new ChromeDriver();
    driver.get("https://www.google.com/");
}

public void failed(){
    File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcFile, new File("/home/rashmj/IdeaProjects/TestNGTutorialDemo/TestNGDemo/src/screenshot/testFailure.jpg"));
}

}
