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

public class eg3 {

	public static void main(String[] args) throws IOException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/signup");
driver.manage().window().maximize();
  String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest=new File("D:\\SeleniumScreenshot\\test"+timestamp+".png");
FileHandler.copy(source, dest);
	
	
	}

}
