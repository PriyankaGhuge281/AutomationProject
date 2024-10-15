package coverFoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxHomePage {
//Variable declaration
@FindBy(xpath = "//div[text()='Male']") private WebElement genderButton;

//Variable initilization

public CoverFoxHomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//method

public void clickOnGenderButton() {
	Reporter.log("Clicking on genedr button",true);
	genderButton.click();
}




}
