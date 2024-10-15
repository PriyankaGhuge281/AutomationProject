package coverFoxUsingPOMclsasse;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethods.CommnlyUsedMethods;

public class CoverFoxTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	String excelPath="C:\\Users\\Shyam Gamane\\eclipse-workspace\\Automation_Selenium2024\\DataSheets\\Excel Test.xlsx";
	String sheetName="Sheet1";
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.coverfox.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	//page 1
	CoverFoxHomePage home = new CoverFoxHomePage(driver);
	home.clickOnGenderbutton();
	Thread.sleep(1000);
	//page 2
	CoverFoxHelthPlanPage helthplan=new CoverFoxHelthPlanPage(driver);
	helthplan.clickOnNextButton();
	Thread.sleep(1000);
	//page3
	CoverFoxMemberDetailsPage details = new CoverFoxMemberDetailsPage(driver);
	details.handelAgeDropDown(CommnlyUsedMethods.readDataFromExcel(excelPath, sheetName, 1, 0));
	details.clickOnNextButton();
	Thread.sleep(1000);
	//page4
	CoverFoxAddressDetails addressdetails =new CoverFoxAddressDetails(driver);
	addressdetails.enterPinCode(CommnlyUsedMethods.readDataFromExcel(excelPath, sheetName, 1, 1));
	addressdetails.enterMobNo(CommnlyUsedMethods.readDataFromExcel(excelPath, sheetName, 1, 2));
	addressdetails.clickOnContinueButton();
	//page 5
	Thread.sleep(4000);
	CoverFoxResult result=new CoverFoxResult(driver);
	result.validateResult();
	
	}

}
