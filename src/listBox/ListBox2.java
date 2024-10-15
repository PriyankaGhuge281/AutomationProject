package listBox;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.cssSelector("select#dropdown-class-example"));
		Thread.sleep(1000);
        Select select=new Select(dropdown);
        select.selectByValue("option2");
      System.out.println(select.isMultiple());
      System.out.println("==============");
                    List<WebElement> alloptions = select.getOptions();
                 ListIterator<WebElement> alp = alloptions.listIterator(); 
	while(alp.hasNext()) {
		System.out.println(alp.next().getText());
	}
	}

}
