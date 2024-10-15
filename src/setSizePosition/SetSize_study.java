package setSizePosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize_study {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Dimension defaultsize = driver.manage().window().getSize();
		System.out.println(defaultsize);
		Thread.sleep(1000);
		//to set size of browser window use Dimension class and create object of Dimension class
		Dimension dimension=new Dimension(500,652);
		driver.manage().window().setSize(dimension);
		Thread.sleep(1000);
		Dimension d=new Dimension(500,300);
		driver.manage().window().setSize(d);
		
		
		

	}

}
