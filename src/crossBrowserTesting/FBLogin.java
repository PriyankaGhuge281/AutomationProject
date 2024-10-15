package crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FBLogin {
WebDriver driver;
@Parameters("browserName")
  @Test
  public void fbtest(String browser) {

if(browser.equals("chrome")) {
	 driver=new ChromeDriver();
}
else if(browser.equals("edge")) {
	 driver=new EdgeDriver();
}
else if(browser.equals("firefox")) {
	 driver=new FirefoxDriver();
}
 

  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
  driver.manage().window().maximize();
  driver.findElement(By.name("firstname")).sendKeys("Priyanka");
  driver.findElement(By.name("lastname")).sendKeys("Gamane");
  driver.findElement(By.name("reg_email__")).sendKeys("9767676767");
  
  
  }
}
