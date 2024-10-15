package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {

WebDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/select-menu");
driver.manage().window().maximize();
Thread.sleep(1000);
   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   File des=new File("D:\\SeleniumScreenshot\\myscreenshot.png");
   FileHandler.copy(source, des);
   
	
	}

}
