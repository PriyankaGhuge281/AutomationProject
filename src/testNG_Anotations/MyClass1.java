package testNG_Anotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyClass1 {
  
 @Test
  public void myTest1() {
  Reporter.log("Test method running",true);
    }
 @BeforeMethod
 public void beforeMethod() {
	 Reporter.log("Before method running",true);
 }
@AfterMethod
public void afterMethod() {
	Reporter.log("After method running",true);
}
@BeforeClass
public void beforeClass() {
	Reporter.log("Before class running",true);
}
@AfterClass
public void afterlass() {
	Reporter.log("After class running",true);
}
@Test
public void myTest2() {
	Reporter.log("Test2 method running",true);
}

}
