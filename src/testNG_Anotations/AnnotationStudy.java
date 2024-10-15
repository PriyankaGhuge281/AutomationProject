package testNG_Anotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void validatePin() {
  Reporter.log("Pin Validation done",true);
  }
@Test
public void validateUserID() {
	Reporter.log("UserId validation done",true);
}
@BeforeClass
public void browserLaunch() {
Reporter.log("Browser launch succssfully",true);	
}
@BeforeMethod
public void enterUserIDPassword(){
	Reporter.log("Succssfully userID and Password entered",true);
}
@AfterMethod
public void logout() {
	Reporter.log("logout succssfully",true);
}
@AfterClass
public void closebrowser() {
	Reporter.log("Close browser",true);
}
}
