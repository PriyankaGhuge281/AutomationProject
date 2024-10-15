package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectableListBox {

	public static void main(String[] args) throws InterruptedException {
	//Multiselectable Drpdown
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	WebElement carslist = driver.findElement(By.xpath("//select[@id='cars']"));
	Select select=new Select(carslist);
	select.selectByIndex(2);       //Selecting Opel
	select.selectByValue("audi");    //Selecting AUdi
	select.selectByVisibleText("Volvo");//Selecting Volvo
	// Dropdown is multiselectable?
	System.out.println(select.isMultiple());
	//How to deselect the option
	//select.deselectByValue("opel");
	//select.deselectAll();
	System.out.println(select.getFirstSelectedOption().getText());
	System.out.println("==============");
	                List<WebElement> alloptions = select.getAllSelectedOptions();
	for(WebElement al:alloptions) {
		System.out.println(al.getText());
	}
	
	   }

}
