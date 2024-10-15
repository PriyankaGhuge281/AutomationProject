package scrolling_study1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException {
		// Window.scrollBy
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//Typecast JavascriptExecutor interface into driver object
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// by calling excutescript method
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2000)");
		String text = driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']")).getText();
System.out.println(text);
	}

}
