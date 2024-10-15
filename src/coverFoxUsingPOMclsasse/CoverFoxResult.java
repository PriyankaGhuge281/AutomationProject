package coverFoxUsingPOMclsasse;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxResult {
// Variable declaration
	@FindBy(xpath = "//div[contains(text(),'matching Health Insurance')]")private WebElement healthplanResult;
    @FindBy(xpath = "//div[@class='plan-card-container']")private List<WebElement>  healthplanBanner;
    
    //Constructor-->Variable initialization
    
    public CoverFoxResult(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
//methods
    
    public void validateResult() {
    	String resultInString = healthplanResult.getText().substring(0,2);
    	int numberOfPlanResult = Integer.parseInt(resultInString);
    	int numberOfPlanBanners = healthplanBanner.size();
if(numberOfPlanResult==numberOfPlanBanners) {
	System.out.println("Result matching,TC passed");
}
else {
	System.out.println("Result not matching,TC failed");
}
    }

}
