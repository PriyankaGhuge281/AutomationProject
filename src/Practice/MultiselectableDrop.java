package Practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectableDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement select = driver.findElement(By.name("cars"));
		Select sc=new Select(select);
		sc.selectByIndex(3);
		sc.selectByVisibleText("Opel");
		sc.selectByValue("volvo");
		System.out.println(sc.isMultiple());
		System.out.println(sc.getFirstSelectedOption().getText());
		List<WebElement> allop = sc.getAllSelectedOptions();
		     Iterator<WebElement> al = allop.iterator();
		while(al.hasNext()) {
			System.out.println(al.next().getText());
		}
		sc.deselectByIndex(3);
		sc.deselectAll();
		
		
		
	}

}
