package Practice;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsStudy {

	public static void main(String[] args) {
	
ChromeOptions co=new ChromeOptions();
ArrayList<String> al=new ArrayList<String>();
al.add("--incognito");
al.add("--start-maximized");
al.add("--disable-notifications");
co.addArguments(al);
WebDriver driver=new ChromeDriver(co);
driver.get("https://www.justdial.com/");
	}

}
