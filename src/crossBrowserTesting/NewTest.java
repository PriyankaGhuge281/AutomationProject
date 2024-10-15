package crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
@Parameters({"firstName","lastName","mobnum"})	
  @Test
  public void f(String firstName,String lastName,String Mobnum) {
  
  WebDriver driver=new ChromeDriver();
  
  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
  driver.manage().window().maximize();
  driver.findElement(By.name("firstname")).sendKeys(firstName);
  driver.findElement(By.name("lastname")).sendKeys(lastName);
  driver.findElement(By.name("reg_email__")).sendKeys(Mobnum);
  
  }
}
