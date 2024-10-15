package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
         //Moving selenium focus to alert popup
		Alert alt = driver.switchTo().alert();
	//If we have to click on 'ok' button ---> accept();
		//alt.accept();
	//If we have to click on 'cancel' button----> dismiss();
		//alt.dismiss();
	//If we have to get text from popup-->getText();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.dismiss();
		
		driver.findElement(By.linkText("Home")).click();
	
	
	}

}
