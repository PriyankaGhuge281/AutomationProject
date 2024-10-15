package setSizePosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition_study {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	// to get default postion of browser window use getPostion() method
	Point defaultposition = driver.manage().window().getPosition();
	System.out.println(defaultposition);
	//to set position use Point class and create object of point class
	Point p=new Point(500, 200);
	//use setSize method 
	driver.manage().window().setPosition(p);
	
	
	

	}

}
