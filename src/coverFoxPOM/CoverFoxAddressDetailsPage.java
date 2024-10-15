package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxAddressDetailsPage {

@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement pinCode;
@FindBy(css = "input#want-expert")private WebElement mobNum;
@FindBy(className = "next-btn")private WebElement continueButton;

public CoverFoxAddressDetailsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void enterPincode(String pincodeNum) {
	Reporter.log("Entering pincode",true);
	pinCode.sendKeys(pincodeNum);
}
public void entermobNum(String Mobnum) {
	Reporter.log("Entering MobileNumber",true);
	mobNum.sendKeys(Mobnum);
}
public void clickOnContinueButton() {
	Reporter.log("Click on Continue button",true);
	continueButton.click();
}
	
}
