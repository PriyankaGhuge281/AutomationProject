 package propertyFileStudy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonMethods.CommnlyUsedMethods;



public class NewTest {
  @Test
  public void f() throws IOException  {
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get(CommnlyUsedMethods.readDataFromPropertyFile("url"));
  driver.findElement(By.name("firstname")).sendKeys(CommnlyUsedMethods.readDataFromPropertyFile("name"));
  driver.findElement(By.name("lastname")).sendKeys(CommnlyUsedMethods.readDataFromPropertyFile("lastname"));
  driver.findElement(By.name("reg_email__")).sendKeys(CommnlyUsedMethods.readDataFromPropertyFile("mobileNum"));
  }
}
