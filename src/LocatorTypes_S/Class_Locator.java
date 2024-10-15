package LocatorTypes_S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Locator {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://www.naukri.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
//using ClassName locator
driver.findElement(By.className("nI-gNb-lg-rg__login")).click();

	}

}
