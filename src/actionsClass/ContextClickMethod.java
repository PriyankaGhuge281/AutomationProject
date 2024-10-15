package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//contextClick-->right Click
	WebElement rightclick = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
//To perform action using Actions class create object of Actions class and pass argument as a driver
	Actions action=new Actions(driver);
	action.contextClick(rightclick).perform();
	
	
	

	}

}
