package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxHealthPlanPage {
//Variable declaration
	
@FindBy(xpath = "//div[text()=' Next ']") private WebElement nextButton;

//Variable initalization

public CoverFoxHealthPlanPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

//method

public void clickOnNextButton() {
	Reporter.log("Clicking on nextButton",true);
	nextButton.click();
}


}
