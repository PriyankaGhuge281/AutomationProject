package screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class eg4 {

	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
  String timest = new SimpleDateFormat("YYYYMMddHHmmss").format(new Date());
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          File dest=new File("D:\\SeleniumScreenshot\\test"+timest+".png");
  FileHandler.copy(source, dest);
  

	}

}
