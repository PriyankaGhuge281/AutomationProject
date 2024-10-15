package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrooling_study {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	//we have to typecast driver object into JavascriptExecutor interface
	JavascriptExecutor js = (JavascriptExecutor)driver;
  // js.executeScript("window.scrollBy(0,1000)");
   WebElement element = driver.findElement(By.id("mousehover"));
	js.executeScript("arguments[0].scrollIntoView(true)",element);
	
	}

}
