package listBox;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//1. Identify the list Box element which we have to handle and stored it in refrence variable
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(2000);
        //2.Create object od Select class which will accept Webelement as a argumnent
		Select select=new Select(day);
		//3.By using any one of select class method we can select the values from lostbox
		//select.selectByVisibleText("28");
		//select.selectByValue("28");
		select.selectByIndex(27);
		
		List<WebElement> allDays = select.getOptions();
		    Iterator<WebElement> it = allDays.iterator();
		    while(it.hasNext()) {
		    	System.err.println(it.next().getText());
		    }
		System.out.println("===============");
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Thread.sleep(1000);
	Select selectmonth = new Select(month);
	selectmonth.selectByVisibleText("Jan");
	System.out.println(selectmonth.isMultiple());
	             List<WebElement> allmonths = selectmonth.getOptions();
	                         for(WebElement alm:allmonths) {
	                        	 System.out.println(alm.getText());
	                         }
	
	}

}
