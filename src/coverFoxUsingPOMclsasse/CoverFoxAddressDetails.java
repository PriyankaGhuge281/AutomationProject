package coverFoxUsingPOMclsasse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetails {

//variable declaration
@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement pinCode;
@FindBy(css = "input#want-expert")private WebElement mobNo;
@FindBy(className = "next-btn")private WebElement continueButton;

//constructor-->Variable declaration
public CoverFoxAddressDetails (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//method
public void enterPinCode(String pincode) {
	pinCode.sendKeys(pincode);
}
public void enterMobNo(String mobnumb) {
	mobNo.sendKeys(mobnumb);
}
public void clickOnContinueButton() {
	continueButton.click();
}




}
