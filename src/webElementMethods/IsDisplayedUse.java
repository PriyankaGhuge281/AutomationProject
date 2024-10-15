package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
        WebElement displayed = driver.findElement(By.cssSelector("input#displayed-text"));
	if(displayed.isDisplayed()) {
		displayed.sendKeys("Pune");
	}
	else {
		System.out.println("Button is not displayed");
	}
	
	}

}
