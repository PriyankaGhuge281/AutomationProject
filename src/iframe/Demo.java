package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//Moving mainPage to Parent farme
		driver.switchTo().frame("frame1");
		String text1 = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
        System.out.println(text1);
       //Moving Parent frame to childFrame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
        String text2 = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
        System.out.println(text2);
        //Moving child frame to parent frame
        driver.switchTo().parentFrame();
        //Moving from parent frame to main page and getText from main page
        driver.switchTo().defaultContent();
       String text3 = driver.findElement(By.xpath("//h1[text()='Nested Frames']")).getText();
        System.out.println(text3);
	
	
	}

}
