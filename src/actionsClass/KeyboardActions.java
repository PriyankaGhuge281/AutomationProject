package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/reg/");
driver.manage().window().maximize();
Thread.sleep(1000);
WebElement day = driver.findElement(By.id("day"));
Actions action =new Actions(driver);
//action.click(day).perform();
Thread.sleep(1000);
//action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//for(int i=1;i<=13;i++) {
	//action.sendKeys(Keys.ARROW_DOWN).perform();
	//Thread.sleep(1000);}

//action.sendKeys(Keys.ENTER).perform();
//SendKey() using axtion class
	
	WebElement name = driver.findElement(By.name("firstname")); 
	action.sendKeys(name, "priyanka").perform();
	Thread.sleep(1000);
	
	}
	
 
	

}


