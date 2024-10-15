package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledUse {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
	driver.manage().window().maximize();
	/*driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8888888888");
	boolean enabled = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	System.out.println(enabled);
	
	if(enabled) {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	 System.out.println("Otp sent");
	}
	else {
		System.out.println("Button is not enabled");*/
	
	WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
	WebElement getOTP = driver.findElement(By.xpath("//button[@type='submit']"));
                mobileNumber.sendKeys("8888555566");
                if(getOTP.isEnabled()) {
                	System.out.println("OTP get send");
                }
                else {
                	System.out.println("Button is disabled");
                }
	
	
	}
	
	
	
	
	
	}


