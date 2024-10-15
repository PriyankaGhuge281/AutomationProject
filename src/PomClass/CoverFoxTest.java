package PomClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Practice.CommanMethods;
import commonMethods.CommnlyUsedMethods;

public class CoverFoxTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://www.coverfox.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

String excelPath="C:\\Users\\Shyam Gamane\\eclipse-workspace\\Automation_Selenium2024\\DataSheets\\Excel Test.xlsx";
String sheetName="Sheet1";


//Page 1
CommanMethods.scrolling(driver);
Thread.sleep(1000);
CoverFoxHome home=new CoverFoxHome(driver);
home.ClickOnFemaleButton();
Thread.sleep(1000);
//Page 2
CoverFoxHealthPlan healthPlan=new CoverFoxHealthPlan(driver);
healthPlan.ClickOnNextButton();
Thread.sleep(1000);
//page3
CoverFoxMemberDetails memberdetails=new CoverFoxMemberDetails(driver);
memberdetails.selectDropdown(CommnlyUsedMethods.readDataFromExcel(excelPath, sheetName, 1, 0));
CommnlyUsedMethods.takeScreenShot(driver, "memberdetails1");
memberdetails.ClickOnNextButton();

Thread.sleep(1000);
CommnlyUsedMethods.takeScreenShot(driver, "memberdetails1");
//Page 4
CoverFoxAddressDetails addressDetails=new CoverFoxAddressDetails(driver);
addressDetails.enterPinCode(CommnlyUsedMethods.readDataFromExcel(excelPath, sheetName, 1, 1));
addressDetails.enterMobNum(CommnlyUsedMethods.readDataFromExcel(excelPath, sheetName, 1, 2));
addressDetails.ClickOnContinueButton();
Thread.sleep(4000);
//Page 5
CoverFoxResult result=new CoverFoxResult(driver);
result.validateResult();
	
	
	
	
	
	}

}
