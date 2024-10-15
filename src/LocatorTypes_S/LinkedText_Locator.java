package LocatorTypes_S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText_Locator {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/signup");
 driver.manage().window().maximize();
 Thread.sleep(2000);
 //Using linkText locator
 //driver.findElement(By.linkText("Already have an account?")).click();

 //Using partialLinkText
 driver.findElement(By.partialLinkText("Already have")).click();
	
	
	}

}
