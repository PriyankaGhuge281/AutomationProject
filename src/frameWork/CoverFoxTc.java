package frameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxTc {

	public static void main(String[] args) throws InterruptedException {
 WebDriver  driver=new ChromeDriver();
 driver.get("https://www.coverfox.com/");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
 driver.findElement(By.xpath("//div[text()='Male']")).click();
 Thread.sleep(1000);
 driver.findElement(By.cssSelector("div.next-btn")).click();
 Thread.sleep(1000);
 WebElement agedropdown = driver.findElement(By.id("Age-You"));
 Select s=new Select(agedropdown);
 s.selectByValue("28y");
 Thread.sleep(1000);
 driver.findElement(By.cssSelector("div.next-btn")).click();
 Thread.sleep(1000);
 driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("421002");
 Thread.sleep(1000);
 driver.findElement(By.cssSelector("input#want-expert")).sendKeys("8888888888");
 Thread.sleep(1000);
driver.findElement(By.cssSelector("div.next-btn")).click();	
Thread.sleep(4000);
String resultText = driver.findElement(By.xpath("//div[contains(text(),'matching Health')]")).getText();	
    System.out.println(resultText);  
String numberInString = resultText.substring(0,2);
      System.out.println(numberInString);
      int resultNumber = Integer.parseInt(numberInString);
	System.out.println("Total result "+resultNumber);
	int numberOfBanners = driver.findElements(By.xpath("//div[@class='plan-card-container']")).size();
	if(resultNumber==numberOfBanners) {
		System.out.println("Banners matching with result numbers Tc Passed");
	}
	else {
		System.out.println("Banners not macthing with result numbers Tc failed");
	}
	}

}
