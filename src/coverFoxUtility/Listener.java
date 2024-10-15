package coverFoxUtility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import commonMethods.CommnlyUsedMethods;
import coverFoxBase.Base;


public class Listener extends Base implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("taking Screenshot listener",true);
		Utility.takesScreenshot(driver, result.getName());

	}
}




