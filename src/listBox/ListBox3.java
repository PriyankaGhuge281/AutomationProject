package listBox;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ListBox3 {

	

	public static void main(String[] args) throws InterruptedException {

WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/signup");
driver.manage().window().maximize();
WebElement day = driver.findElement(By.name("birthday_day"));
Thread.sleep(1000);
Select select =new Select(day);
 select.selectByVisibleText("20");
            List<WebElement> allday = select.getOptions();
           Iterator<WebElement> al = allday.iterator();
           while(al.hasNext()) {
        	   System.out.println(al.next().getText());
           }
 Thread.sleep(1000);
 WebElement month = driver.findElement(By.cssSelector("select#month"));
 Thread.sleep(1000);
 Select selectmonth = new Select(month);
 selectmonth.selectByValue("12");
 List<WebElement> alm = selectmonth.getOptions();
 for(WebElement alm1:alm) {
	 System.out.println(alm1.getText());
 }
 
 WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
 Select selectyear=new Select(year);
 selectyear.selectByValue("2020");
 
 
 

	}

}
