package Wait_Synchoronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.discoveryplus.in/home");
driver.manage().window().maximize();
 //Implicit wait
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();

	}

}
