package chromeOptions_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlockNotification {

	public static void main(String[] args) {
	//TO block notification by using ChromeOption class
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--disable-notifications");
		//How to start browser in maximise mode
		co.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.justdial.com/");
		//driver.manage().window().maximize();
		//How to start browser in maximise mode
		
		

	}

}
