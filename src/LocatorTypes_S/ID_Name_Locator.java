package LocatorTypes_S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_Name_Locator {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://auth.discoveryplus.in/login");
driver.manage().window().maximize();
Thread.sleep(1000);
//Using Locator ID
//driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");

//Using Locator name
driver.findElement(By.name("mobileNumber")).sendKeys("9756565656");
		
	}

}
