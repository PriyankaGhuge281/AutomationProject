package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_AllRowCoulmnReading {

	public static void main(String[] args) {
  WebDriver driver=new ChromeDriver();
  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  //TotalRows
  int totalRows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
  System.out.println(totalRows);
  //Total Columns
int totalColumns = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[1]/th")).size();
	System.out.println(totalColumns);
	//Read all columns and rows except header
	for(int i=2;i<=totalRows;i++) {
		for(int j=1;j<=totalColumns;j++) {
			String value = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+ i+"]/td["+ j+"]")).getText();
		System.out.print(value+" || ");
		}
	System.out.println();
	}
	
	
	
	}




}
