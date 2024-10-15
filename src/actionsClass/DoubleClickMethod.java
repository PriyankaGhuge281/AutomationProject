package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
    driver.manage().window().maximize();
    Thread.sleep(1000);
    WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
    Actions action=new Actions(driver);
    action.doubleClick(doubleclick).perform();
	
	
	
	}

}
