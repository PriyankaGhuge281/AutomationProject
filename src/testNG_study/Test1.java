package testNG_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void myTest() {
  WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
  driver.get("https://www.google.co.in/");
  }
@Test
public void myTest1() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/reg/");
}
@Test
public void myTest3() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
}

}
