package misc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	driver.findElement(By.name("q")).sendKeys("iphone 14");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
	String ratings = driver.findElement(By.xpath("(//div[contains(@class,'col col-7-12')])[1]/div[2]/span[2]/span/span[1]")).getText();
	
	System.out.println(ratings);
	}

}
