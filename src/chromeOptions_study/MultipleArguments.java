package chromeOptions_study;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleArguments {

	public static void main(String[] args) {
		// Browser open in incognito mode,Maximised browser from starting,Disable notification,headless
		ArrayList<String> al =new ArrayList<String>();
		al.add("-disable-notifications");
		al.add("start-maximized");
		al.add("--incognito");
		ChromeOptions co=new ChromeOptions();
		co.addArguments(al);
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.justdial.com/");
		
		
	}

}
