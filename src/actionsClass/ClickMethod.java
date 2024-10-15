package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		WebElement clickbutton = driver.findElement(By.xpath("//button[text()='Click Me']"));
		//To perform click action by using Actions class
		//Create an object of ACtions class and pass driver as a parameter
		Actions action =new Actions(driver);
		//By using click() method of ACtions class we can take required action
		action.click(clickbutton).perform();
		
		
	}

}
