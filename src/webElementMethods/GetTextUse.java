package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/signup");
String actual = driver.findElement(By.xpath("//div[text()='Create a new account']")).getText();
System.out.println(actual);
String expected="Create a new account";

if(actual.equals(expected)) {
	System.out.println("actual and expected heading matched, TC is passed");
}
else {
	System.out.println("actal and expected heading not matched, TC failed");
}

	}

}
