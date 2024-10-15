package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IRCTC {

	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("pun");
	List<WebElement> stationname = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
   for(WebElement s:stationname) {
	   System.out.println(s.getText());
   }
	String expected ="PUNDHAG-PNW";
	for(WebElement st:stationname) {
		String actaul = st.getText();
	if(actaul.contains("PNW")) {
		st.click();
		break;
	}
	
	}
	
	
	}

}
