package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	//WebElement day = driver.findElement(By.id("day"));
	
	Actions action=new Actions(driver);
	//action.click(day).perform();
	//action.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).build().perform();
	
	//for(int i=1;i<=7;i++) {
		//action.sendKeys(Keys.ARROW_DOWN).perform();}
	//action.sendKeys(Keys.ENTER).perform();
	WebElement name = driver.findElement(By.name("firstname"));
	action.sendKeys(name, "priyanka").perform();
	
	
	}
	
	
	
}


