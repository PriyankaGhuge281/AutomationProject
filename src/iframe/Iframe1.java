package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//Moving selenium focus to iframe
		driver.switchTo().frame("iframeResult");
		String text = driver.findElement(By.xpath("//h1[text()='This is a Heading']")).getText();
         System.out.println(text);
         //Moving selenium focus from iframe to mainpage
         driver.switchTo().defaultContent();
         driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
         
	
	}

}
