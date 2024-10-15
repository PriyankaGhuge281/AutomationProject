package coverFoxUsingPOMclsasse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMemberDetailsPage {
//Variable declration
@FindBy(id = "Age-You")private WebElement ageDropdown;
@FindBy(className = "next-btn") private WebElement nextButton;

//Constructor--> To initialize variable

public CoverFoxMemberDetailsPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

//Methods
public void handelAgeDropDown(String age) {
Select s=new Select(ageDropdown);
s.selectByValue(age+"y");
	}

public void clickOnNextButton()
{
	nextButton.click();
}


}
