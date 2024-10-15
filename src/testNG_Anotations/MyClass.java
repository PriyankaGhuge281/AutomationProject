package testNG_Anotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyClass {
 @BeforeMethod
 public void beforeMethod() {
	 Reporter.log("Before method running",true);
 }
	@Test
  public void mytest1() {
 
Reporter.log("Test method running",true);
  
   }
@Test
public void myTest2() {
	Reporter.log("Test2 method running",true);
}

@AfterMethod
public void afterMethod() {
	Reporter.log("After method running",true);
}


}
