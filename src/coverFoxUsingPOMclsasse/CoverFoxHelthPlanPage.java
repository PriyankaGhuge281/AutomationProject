package coverFoxUsingPOMclsasse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHelthPlanPage {

//Variable declaration
@FindBy(className = "next-btn")private WebElement nextButton;

//Constructor-->Intialize variable
public CoverFoxHelthPlanPage(WebDriver driver) 
{
PageFactory.initElements(driver, this);	
}

//Methods
public void clickOnNextButton() {
	nextButton.click(); 
}





}
