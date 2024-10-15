package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	//totalrows in table
	int rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
	System.out.println("Total number of rows "+rows);
	
	//totalcolumns in table
	int columns = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr[1]/th")).size();
	System.out.println("Total number of columns "+columns);	
	//Print only header from given table
	for(int i=1;i<=columns;i++) {
		String header = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr[1]/th["+i+"]")).getText();
	    System.out.print(header+" ||");
	}
	System.out.println();
	//Read table data
	for(int i=1;i<=rows;i++) {
		for(int j=1;j<=columns;j++) {
			String tabledata = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.print(tabledata+" ||");
		}
System.out.println();
	}
	System.out.println("=================");
	for(int i=1;i<=columns;i++) {
		String singlerow = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td["+i+"]")).getText();
	System.out.print(singlerow+" ||");
	}
	System.out.println();
	
	
	}


}
