package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic2 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
driver.findElement(By.name("q")).sendKeys("Big");
List<WebElement> list = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li"));

for(WebElement ls:list) {
	System.out.println(ls.getText());
}
String expected="big mumbai";
for(WebElement l:list) {
	String actual = l.getText();
if(actual.equals(expected)) {
	l.click();
}
}
	
	
	
	}

}
