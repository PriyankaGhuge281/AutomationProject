package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_SIngleRowReading {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	//how to get total number of rows
	int noOfRows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
	System.out.println(noOfRows);
	
	//how to get total number of columns
int noOfColumns = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size();
	
	System.out.println(noOfColumns);
	System.out.println("==================");
	//read complete header
	for(int i=1;i<=noOfColumns;i++) {
		String myText = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr/th["+i+"]")).getText();
	System.out.print(myText+" ");
	}
	System.out.println();
	System.out.println("========================");
	
	//read complete row
	for(int i=1;i<=noOfColumns;i++) {
		String value = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[7]/td["+i+"]")).getText();
	System.out.print(value+" ");
	}
	System.out.println();
	
	
	
	}

}
