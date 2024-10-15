package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe3 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/nestedframes");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.switchTo().frame("frame1");
	String parenttext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
System.out.println(parenttext);
//moving selenium focus to childframe
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
	
	String childtext = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	System.out.println(childtext);
	driver.switchTo().defaultContent();
	String mainpageframe=driver.findElement(By.xpath("//h1[text()='Nested Frames']")).getText();
	System.out.println(mainpageframe);
	}

}
