package LocatorTypes_S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector_Locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.co");
	
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
driver.findElement(By.cssSelector("input#usernameField")).sendKeys("Test@123");
Thread.sleep(2000);
//driver.findElement(By.cssSelector("input#passwordField")).sendKeys("123@00");	
	//driver.findElement(By.cssSelector("input.pr-60")).sendKeys("Test356");
	driver.findElement(By.cssSelector("input.pr-60[type=password]")).sendKeys("123#90");
	
	}

}
