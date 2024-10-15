package chromeOptions_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito_window {

	public static void main(String[] args) {
		//How to open Browser in incognito mode
	// Create object of chromeOptions class
		ChromeOptions co=new ChromeOptions();
		//use addArguments() method 
		co.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.naukri.com/");
		
		
		
		
		
	}

}
