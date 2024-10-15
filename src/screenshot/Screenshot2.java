package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	            String random = RandomString.make(3);
	
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  File dest=new File("D:\\SeleniumScreenshot\\test_"+random+".png");
  FileHandler.copy(source, dest);

	}

}
