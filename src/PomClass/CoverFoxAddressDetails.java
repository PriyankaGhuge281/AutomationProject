package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetails {
@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement pinCode;
@FindBy(id = "want-expert")private WebElement mobiNum;
@FindBy(className = "next-btn")private WebElement continueButton;

public CoverFoxAddressDetails(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	
public void enterPinCode(String pincode) {
	pinCode.sendKeys(pincode);
}
public void enterMobNum(String MobileNumber) {
	mobiNum.sendKeys(MobileNumber);
}
public void ClickOnContinueButton() {
	continueButton.click();
}

}
