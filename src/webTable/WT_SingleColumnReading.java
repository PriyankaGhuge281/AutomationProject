package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_SingleColumnReading {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	//Reading Number of rows present in table
	int totalNoOfRows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
	System.out.println("Total number of rows "+totalNoOfRows);
	//Reading Number of columns present in table
	int totalNoOfColumns = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size();
System.out.println("Total number of columns "+totalNoOfColumns);
	//Read complete column
for(int i=2;i<=totalNoOfRows;i++) {
	String columndata = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td[3]")).getText();
System.out.println(columndata);
}
	
	
	}

}
