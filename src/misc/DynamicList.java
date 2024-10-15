package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicList {

	public static void main(String[] args) {
		 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	driver.findElement(By.name("q")).sendKeys("kia");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
	List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	
	for(WebElement s:searchResult) {
		System.out.println(s.getText());
	}
String expectedResult="kia carens";
for(WebElement sr:searchResult) {
	String actualResult = sr.getText();
if(actualResult.equals(expectedResult)) {
	sr.click();
break;
}


}

	
	}

}
