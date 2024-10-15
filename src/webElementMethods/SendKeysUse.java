package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUse {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Priyanka");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pune");
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		
		//driver.close();
		
		
		
		
	}

}
