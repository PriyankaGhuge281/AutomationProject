package DataProviderUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBLogin {
  
	@Test(dataProviderClass = DataProviderUse.TestData.class,dataProvider = "maleData")

 public void fb(String firstName,String lastName,String mobileNum) {
  
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
driver.findElement(By.name("firstname")).sendKeys(firstName);
driver.findElement(By.name("lastname")).sendKeys(lastName);
driver.findElement(By.name("reg_email__")).sendKeys(mobileNum);
  }
}
