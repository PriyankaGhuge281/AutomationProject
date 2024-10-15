package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//Switch selenium focus from main page to iframe
		driver.switchTo().frame("frame1");
		String text1 = driver.findElement(By.xpath("(//h1[text()='This is a sample page'])[1]")).getText();
        System.out.println(text1);
        //Switching selenium focus from iframe to mainpage
        driver.switchTo().defaultContent();
         String text2 = driver.findElement(By.xpath("//h1[text()='Frames']")).getText();
	System.out.println(text2);
	
	}

}
