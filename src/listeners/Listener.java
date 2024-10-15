package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class Listener implements ITestListener {
//success
//failed
//Skipped
@Override
public void onTestSuccess(ITestResult result) {
	Reporter.log("money transfer succssfully",true);
}
@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("money transfer failed",true);
	}
@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("money transfer skipped",true);
	}


}





