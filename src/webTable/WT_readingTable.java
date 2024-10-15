package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_readingTable {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	//totalrows
	int totalrows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
	System.out.println(totalrows);
	//totalcolumns
	int totalcolumns = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[1]/th")).size();	
		System.out.println(totalcolumns);
		
	//read whole table
		for(int i=1;i<=totalrows;i++) {
			for(int j=1;j<=totalcolumns;j++) {
				if(i==1) {
					String header = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[1]/th["+j+"]")).getText();
				System.out.print(header+" ");
				}
				else {
					String table = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(table+" ");
				}
			
			}
			System.out.println();
			
		}
		
	
	}

}
