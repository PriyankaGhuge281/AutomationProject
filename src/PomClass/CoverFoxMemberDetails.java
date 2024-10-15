package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMemberDetails {

	@FindBy(id = "Age-You")private WebElement ageDropDown;
	@FindBy(className = "next-btn")private WebElement nextButton;
	
	public CoverFoxMemberDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
public void selectDropdown(String age) {
	Select s=new Select(ageDropDown);
	s.selectByValue(age+"y");
	}
public void ClickOnNextButton() {
	nextButton.click();
}


}
