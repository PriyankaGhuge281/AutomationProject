package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// to perform mouse actions prsent on webpage we have to create object of ACtion class and pass argument as a driver
WebDriver driver=new ChromeDriver();
driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
driver.manage().window().maximize();
Thread.sleep(1000);
WebElement source = driver.findElement(By.id("draggable"));
WebElement dest = driver.findElement(By.id("droppable"));
Actions action=new Actions(driver);
//action.dragAndDrop(source, dest).perform();
action.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
	
	}

}
