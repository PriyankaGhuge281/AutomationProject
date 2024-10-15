package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic3 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("sola");
List<WebElement> station = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	for(WebElement st:station) {
		System.out.println(st.getText());
	}
	String expected ="SOLADI";
	for(WebElement s:station) {
		String actual = s.getText();
	if(actual.contains("SOLADI")) {
		s.click();
	}
	
	}
	
	}

}
