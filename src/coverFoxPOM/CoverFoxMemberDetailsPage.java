package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class CoverFoxMemberDetailsPage {

@FindBy(id = "Age-You") private WebElement agedropdown;
@FindBy(className = "next-btn")private WebElement nextButton;

public CoverFoxMemberDetailsPage(WebDriver driver) {
PageFactory.initElements(driver, this);	
}

public void selectAge(String age) {
Reporter.log("Handling age dropdown",true);
Select select=new Select(agedropdown);
select.selectByValue(age+"y");
	
}
public void clickOnNextButton() {
	Reporter.log("Clicking on NextButton",true);
	nextButton.click();
}


}
