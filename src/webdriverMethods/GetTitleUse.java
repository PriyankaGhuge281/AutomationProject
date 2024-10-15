package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleUse {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/b/?_encoding=UTF8&node=1389402031&pd_rd_w=xDgWh&content-id=amzn1.sym.9ec4b9f2-5153-472d-8516-562de696a53f&pf_rd_p=9ec4b9f2-5153-472d-8516-562de696a53f&pf_rd_r=FSYP4N8XPPBQHKPDW0N0&pd_rd_wg=KejHe&pd_rd_r=086e9aad-48d8-448f-b6fa-0076e9a673e3&ref_=pd_hp_d_hero_unk");
		String title = driver.getTitle();
		System.out.println(title);
		String cuurenturl = driver.getCurrentUrl();
		System.out.println(cuurenturl);
		
		
		
		
	}

}
