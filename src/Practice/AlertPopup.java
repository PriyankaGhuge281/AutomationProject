package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[1]")).click();
Thread.sleep(2000);
Alert alt = driver.switchTo().alert();
System.out.println(alt.getText());	
alt.accept();


	
	
	}

}
