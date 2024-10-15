package crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FB1login {
WebDriver driver;
@Parameters("BrowserName")
@Test
public void cbt(String browser) {
if(browser.equals("chrome")) {
	driver=new ChromeDriver();
}
else if(browser.equals("edge"))	{
	driver=new EdgeDriver();
}
else if(browser.equals("firefox")) {
	driver=new FirefoxDriver();
}
driver.manage().window().maximize();
driver.get("https://www.facebook.com/login.php/");

driver.findElement(By.name("email")).sendKeys("test@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Test@123");

}
  
  
  
  }

