package DataProviderUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookLogin {
  @Test(dataProviderClass = DataProviderUse.TestData1.class,dataProvider = "CriketerName")
  public void f(String firstName,String lastName,String mobileNum) {
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
  driver.findElement(By.name("firstname")).sendKeys(firstName);
  driver.findElement(By.name("lastname")).sendKeys(lastName);
  driver.findElement(By.name("reg_email__")).sendKeys(mobileNum);
  
  }
}
