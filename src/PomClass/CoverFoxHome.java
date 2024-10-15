package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHome {
//Variable declaration
@FindBy(xpath = "//div[text()='Female']")private WebElement femaleButton;
//Constructor--> Variable initialization

public CoverFoxHome(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//method
public void ClickOnFemaleButton() {
	femaleButton.click();
}



}
