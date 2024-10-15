package scrolling_study1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg2 {

	public static void main(String[] args) throws InterruptedException {
		// window.scrollBy
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,4000)");
       Thread.sleep(1000);
       js.executeScript("window.scrollBy(0,-2000)");
	}

}
