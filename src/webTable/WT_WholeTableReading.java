package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_WholeTableReading {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	//totalrows
	int totalrows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
	System.out.println(totalrows);
	//totalcolumns

	int totalcolumns = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr[1]/th")).size();
	System.out.println(totalcolumns);
	
	//print data seperately
	for(int i=1;i<=totalrows;i++) {
		for(int j=1;j<=totalcolumns;j++) {
			String value = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.print(value+ " || ");
	
		}
		System.out.println();
	}
//Print header seperatly
	for (int i=1;i<=totalcolumns;i++) {
		String header = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr[1]/th["+i+"]")).getText();
	System.out.print(header+" || ");
	}
	System.out.println();
	
	}

}
