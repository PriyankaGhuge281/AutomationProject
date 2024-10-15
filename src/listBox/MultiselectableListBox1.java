package listBox;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectableListBox1 {

	public static void main(String[] args) throws InterruptedException {
	
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/select-menu");
driver.manage().window().maximize();
Thread.sleep(1000);
 WebElement cars = driver.findElement(By.id("cars"));
 Select s=new Select(cars);
 s.selectByValue("audi");
 s.selectByVisibleText("Opel");
 s.selectByIndex(0);
System.out.println(s.isMultiple());
//s.deselectByValue("audi");
//s.deselectAll();
System.out.println(s.getFirstSelectedOption().getText());
System.out.println("=============");
                List<WebElement> allOption = s.getAllSelectedOptions();
                  ListIterator<WebElement> al = allOption.listIterator();
                    while(al.hasNext()) {
                    	System.out.println(al.next().getText());
                    }

	}

}
