package crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo {
  WebDriver driver;
@Parameters({"FirstName","LastName","MobNum"})
  @Test
  public void fbLogin(String firstName, String lastName,String mobNum) {
  driver=new ChromeDriver();
	driver.manage().window().maximize();
  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
  driver.findElement(By.name("firstname")).sendKeys(firstName);
  driver.findElement(By.name("lastname")).sendKeys(lastName);
  driver.findElement(By.name("reg_email__")).sendKeys(mobNum); 
  }
}
