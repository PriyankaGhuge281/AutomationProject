package CoverFoxTest;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import coverFoxBase.Base;
import coverFoxPOM.CoverFoxAddressDetailsPage;
import coverFoxPOM.CoverFoxHealthPlanPage;
import coverFoxPOM.CoverFoxHomePage;
import coverFoxPOM.CoverFoxMemberDetailsPage;
import coverFoxPOM.CoverFoxResult;
import coverFoxUtility.Utility;
@Listeners(coverFoxUtility.Listener.class)
public class TC1234_CoverFox_ValidateBannerCount extends Base {
	CoverFoxHomePage homepage;
	CoverFoxHealthPlanPage healthPlan;
	CoverFoxMemberDetailsPage memberDetails;
	 CoverFoxAddressDetailsPage addressDetails;
	 CoverFoxResult validateResult;
	 String excelPath=System.getProperty("user.dir")+"\\DataSheets\\Excel Test.xlsx";
     String sheetName="Sheet1"; 
	 @BeforeClass
  public void openApplication() throws FileNotFoundException {
	launchBrowser();  
	  }
	
	@BeforeMethod
	//click on gender button,next button,memberdetails,Address details
	public void enterdetails() throws EncryptedDocumentException, IOException, InterruptedException {
	 homepage=new CoverFoxHomePage(driver);	
	 healthPlan=new CoverFoxHealthPlanPage(driver);
	 memberDetails=new CoverFoxMemberDetailsPage(driver);
	  addressDetails=new CoverFoxAddressDetailsPage(driver);
	homepage.clickOnGenderButton();
	Thread.sleep(1000);
	healthPlan.clickOnNextButton();
	Thread.sleep(1000);
	memberDetails.selectAge(Utility.readDataFromExcelFile(excelPath, sheetName, 0, 0));
	Thread.sleep(1000);
	memberDetails.clickOnNextButton();
	Thread.sleep(2000);
	addressDetails.enterPincode(Utility.readDataFromExcelFile(excelPath, sheetName, 0, 1));
	Thread.sleep(1000);
	addressDetails.entermobNum(Utility.readDataFromExcelFile(excelPath, sheetName, 0, 2));
	addressDetails.clickOnContinueButton();
	Thread.sleep(4000);
	}
	
	@Test
  public void validateBannerCount() throws InterruptedException {
		
		validateResult=new CoverFoxResult(driver);
  int textCount = validateResult.getCountFromText();
 int bannerCount = validateResult.getCountFromBanner();
 Assert.assertEquals(textCount, bannerCount,"If textCount and BannerCount not equals TC failed");
	
}
@AfterClass
public void closeApplication() {
	closeBrowser();
}


}
