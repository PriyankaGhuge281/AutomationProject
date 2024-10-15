package coverFoxUsingPOMclsasse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage {
//Variable declaration
@FindBy(xpath = "//div[text()='Male']") private WebElement gender;
	
//Constructor-->Variablr initialization
public CoverFoxHomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

//Methods--> to take actions on varaible

public void clickOnGenderbutton() {
	gender.click();
}


}
