package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) {
		//click();
		//contextClick();
		//doubleClick();
		//dragAndDrop();
		//moveToElement();
		//scrollToElement();
		
WebDriver driver=new ChromeDriver();
driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
    
//WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
//WebElement rightclick = driver.findElement(By.xpath("//button[text()='Right Click Me']"));	
//WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
WebElement scrolldown = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
Actions action=new Actions(driver);
	//action.click(click).perform();
	//action.contextClick(rightclick).perform();
//action.moveToElement(rightclick).contextClick().build().perform();
//action.moveToElement(doubleclick).doubleClick().build().perform();
	//action.scrollToElement(scrolldown).perform();
	//action.moveToElement(scrolldown).scrollToElement(scrolldown).build().perform();
	action.scrollByAmount(0, 500).perform();
	
	}

}
