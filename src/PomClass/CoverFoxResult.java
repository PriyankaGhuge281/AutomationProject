package PomClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResult {
@FindBy(xpath = "//div[contains(text(),'Health Insurance Plans')]")private WebElement numberOfPlan;
@FindBy(xpath = "//div[@class='plan-card-container']")private List<WebElement> numberOfBanner;

public CoverFoxResult(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void validateResult() {
String planResult = numberOfPlan.getText().substring(0, 2);
int totalPlan = Integer.parseInt(planResult);
int totalBanner = numberOfBanner.size();
if(totalPlan==totalBanner) {
	System.out.println("TC passed");
}
else {
	System.out.println("TC failed");
}

}

}
