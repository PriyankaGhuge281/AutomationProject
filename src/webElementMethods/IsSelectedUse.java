package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUse {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
	   driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		boolean result = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();

	System.out.println(result);
	}

}
