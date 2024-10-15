package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_SingleDataReading {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	//Reading tableheader
	String tableheader1 = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[1]/th[2]")).getText();
	System.out.println(tableheader1);

	//reading any tabledata
	
	String mydata = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[6]/td[3]")).getText();
	System.out.println(mydata);
	
	
	}

}
