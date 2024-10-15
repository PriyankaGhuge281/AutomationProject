package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_WholetablereadingEg2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://shorturl.at/UDG7L");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//total columns
	int totalcolumns = driver.findElements(By.xpath("   (//table[@class='imspo_tps__tb'])[7]/thead/tr/th")).size();	
	System.out.println("Total columns "+totalcolumns);
	//total rows
	int totalrows = driver.findElements(By.xpath("(//table[@class='imspo_tps__tb'])[7]/tbody")).size();
	System.out.println("Total rows "+totalrows);
	//read header
	for(int i=1;i<=totalcolumns;i++) {
		String header = driver.findElement(By.xpath("(//table[@class='imspo_tps__tb'])[7]/thead/tr/th["+i+"]")).getText();
	System.out.print("Header is "+header+" ||");
	}
	System.out.println();
	//read table data
	for(int i=1;i<=totalrows;i++) {
		for(int j=1;j<=totalcolumns;j++) {
			String tabledata = driver.findElement(By.xpath("(//table[@class='imspo_tps__tb'])[7]/tbody["+i+"]/tr[2]/td["+j+"]")).getText();
		System.out.print(tabledata+" ||");
		}
	System.out.println();
	
	}
	
	
	
	}
	
	
	}


