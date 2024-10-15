package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ListBoxHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement select = driver.findElement(By.id("dropdown-class-example"));
		Select sc=new Select(select);
		sc.selectByIndex(1);
		System.out.println(sc.isMultiple());
	    List<WebElement> option = sc.getOptions();
        for(WebElement alloptions:option) {
        	System.out.println(alloptions.getText());
        }
	}

}
