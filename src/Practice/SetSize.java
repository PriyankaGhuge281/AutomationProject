package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
Thread.sleep(1000);
//Dimension defaultsize = driver.manage().window().getSize();

//System.out.println(defaultsize);
//Dimension d =new Dimension(500,300 );
//driver.manage().window().setSize(d);
Point defaultposition = driver.manage().window().getPosition();
System.out.println(defaultposition);
Point p =new Point(500,200);
driver.manage().window().setPosition(p);

		
		
	}

}
