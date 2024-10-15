package Wait_Synchoronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitTest {

	public static void main(String[] args) {
	
WebDriver driver=new ChromeDriver();
driver.get("https://www.discoveryplus.in/home");
driver.manage().window().maximize();
FluentWait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(4000)).pollingEvery(Duration.ofMillis(4000))
.ignoring(NoSuchElementException.class);
w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[text()='Sign In'])[2]")));
driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	
		
		
		
	}

}
