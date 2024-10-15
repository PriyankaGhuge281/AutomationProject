package Wait_Synchoronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticwait {

	public static void main(String[] args) throws InterruptedException {
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.discoveryplus.in/home");
  driver.manage().window().maximize();
  Thread.sleep(5000);
  driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();

	
	
	
	
	}

}
