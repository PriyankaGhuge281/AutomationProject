package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(2000);
		//driver.close();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
	
	
	
	
	}

}
