package commonMethods;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxTc2 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// Use of Comman methods in TC
		
		String excelPath="C:\\Users\\Shyam Gamane\\eclipse-workspace\\Automation_Selenium2024\\DataSheets\\Excel Test.xlsx";
        String sheetName="Sheet1";
        String age=CommnlyUsedMethods.readDataFromExcel(excelPath, sheetName, 0, 0);
        String pinCode=CommnlyUsedMethods.readDataFromExcel(excelPath, sheetName, 0, 1);
        String mobNum=CommnlyUsedMethods.readDataFromExcel(excelPath, sheetName, 0, 2);
	
        WebDriver  driver=new ChromeDriver();
        driver.get("https://www.coverfox.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        driver.findElement(By.xpath("//div[text()='Male']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.next-btn")).click();
        Thread.sleep(1000);
        WebElement agedropdown = driver.findElement(By.id("Age-You"));
        Select s=new Select(agedropdown);
        s.selectByValue(age+"y");
        CommnlyUsedMethods.takeScreenShot(driver, "age");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.next-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys(pinCode);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#want-expert")).sendKeys(mobNum);
        Thread.sleep(1000);
       driver.findElement(By.cssSelector("div.next-btn")).click();	
       Thread.sleep(4000);
       String resultText = driver.findElement(By.xpath("//div[contains(text(),'matching Health')]")).getText();	
           System.out.println(resultText);  
       String numberInString = resultText.substring(0,2);
             System.out.println(numberInString);
             int resultNumber = Integer.parseInt(numberInString);
       	System.out.println("Total result "+resultNumber);
       	int numberOfBanners = driver.findElements(By.xpath("//div[@class='plan-card-container']")).size();
       CommnlyUsedMethods.takeScreenShot(driver, "Tc123");
       	if(resultNumber==numberOfBanners) {
       		System.out.println("Banners matching with result numbers Tc Passed");
       	}
       	else {
       		System.out.println("Banners not macthing with result numbers Tc failed");
       	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
