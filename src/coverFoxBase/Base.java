package coverFoxBase;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import coverFoxUtility.Utility;

public class Base {
//driver setup
//url setup
//launch browser
//close browser
	
 protected static WebDriver driver;
  
  public void launchBrowser() throws FileNotFoundException {
 ChromeOptions option=new ChromeOptions();
 option.addArguments("--disable-notifications");
 driver=new ChromeDriver(option);
 driver.manage().window().maximize();
 driver.get("https://www.coverfox.com/");
 Reporter.log("Browser launching",true);
 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
 Reporter.log("Waiting..",true);
}
public void closeBrowser() {
	Reporter.log("Browser closing",true);
	driver.quit();
}
	
	
	
	
	
}
