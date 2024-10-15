package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
driver.manage().window().maximize();
Thread.sleep(1000);
WebElement source = driver.findElement(By.id("draggable"));

WebElement target = driver.findElement(By.id("droppable"));
	Actions action=new Actions(driver);
//	action.dragAndDrop(source, target).perform();
	action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();

	
	
	
	}

}
