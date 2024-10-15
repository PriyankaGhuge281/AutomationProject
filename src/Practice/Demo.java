package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) {

//ACtions class provides different types of mouse actions methods and Keyboard methods
		//click();
		//doubleClick();
		//contextClick();
		//dragAndDrop();
		//moveToElemnt
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		 WebElement clickbutton = driver.findElement(By.xpath("//button[text()='Click Me']"));
	    Actions action=new Actions(driver);
	   action.click(clickbutton).perform();
	
	
	
	}

}
