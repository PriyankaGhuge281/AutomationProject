package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		   driver.get("https://www.espncricinfo.com/series/england-in-india-2023-24-1389386/india-vs-england-5th-test-1389403/full-scorecard");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		   
		   //Total columns
		  int  totalcolumns=driver.findElements(By.xpath("(//table[contains(@class,'ds-w-full')])[1]/thead/tr/th")).size();
		   //total rows
		  System.out.println(totalcolumns);
//total rows
		  
	int totalrows = driver.findElements(By.xpath("(//table[contains(@class,'ds-w-full ds-table ds-table')])[1]/tbody/tr")).size();	  
	System.out.println(totalrows);
	//total header
	for(int i=1;i<=totalcolumns;i++) {
		String header = driver.findElement(By.xpath("(//table[contains(@class,'ds-w-full')])[1]/thead/tr/th["+i+"]")).getText();
	System.out.print(header+" ||");
	}
	System.out.println();
	
	//for table
	for(int i=1;i<=totalrows;i++) {
	for(int j=1;j<=totalcolumns;j++)
		{
		 
	String totaltable = driver.findElement(By.xpath("(//table[contains(@class,'ds-w-full ds-table ds-table')])[1]/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.print(totaltable+" ||");
		}
	System.out.println();
	}
	
	}

}
