package coverFoxPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxResult {
@FindBy(xpath = "//div[contains(text(),'Health Insurance Plans')]")private WebElement matchingPlan;
@FindBy(xpath = "//div[@class='plan-card-container']")private List<WebElement> nubOfPlan;
	
	
public CoverFoxResult(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public int getCountFromText() {
Reporter.log("Getting count from text",true );
	String countfromtext = matchingPlan.getText().substring(0, 2);
 int countofplan = Integer.parseInt(countfromtext);
return countofplan;

}
public int getCountFromBanner() {
	Reporter.log("Getting count from Banner",true );
int countofbanner = nubOfPlan.size();
 return countofbanner;
}
}
