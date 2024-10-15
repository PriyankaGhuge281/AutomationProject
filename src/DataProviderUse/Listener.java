package DataProviderUse;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import commonMethods.CommnlyUsedMethods;
public class Listener extends FB1login implements ITestListener {

@Override
	public void onTestSuccess(ITestResult result) {
		try {
			CommnlyUsedMethods.takeScreenShot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
@Override
public void onTestFailure(ITestResult result) {
	
}



}
