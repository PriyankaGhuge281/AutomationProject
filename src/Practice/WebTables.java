package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//get single header
		String headerText = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[1]/th[3]")).getText();
        System.out.println(headerText);
        //get single data
        String text = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[11]/td[2]")).getText();
	System.out.println(text);
	//get no of rows
	int totalrows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
	System.out.println(totalrows);
	//get no of columns
	int totalcolums = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[1]/th")).size();
	System.out.println(totalcolums);
	//read total header
	for(int i=1;i<=totalcolums;i++) {
		String headers = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[1]/th["+i+"]")).getText();
	System.out.print(headers+" ");
	}
	System.out.println();
	System.out.println("====================");
	//Read complete row
	for(int i=1;i<=totalcolums;i++) {
		String row = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[2]/td["+i+"]")).getText();
	System.out.print(row+" ");
	
	}
	System.out.println();
	System.out.println("===============");
	//Read complete column
	for(int i=2;i<=totalrows;i++) {
		String column = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr["+i+"]/td[3]")).getText();
	System.out.println(column);
	}
	
	}

}
