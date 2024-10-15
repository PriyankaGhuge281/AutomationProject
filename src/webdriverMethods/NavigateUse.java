package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUse {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
       Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();
	}
}
