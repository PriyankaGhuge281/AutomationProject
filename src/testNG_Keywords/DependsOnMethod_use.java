package testNG_Keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod_use {
  @Test(dependsOnMethods = {"b"})
  public void a() {
	  
	  Reporter.log("Method a is running", true);
  }
@Test
public void b() {
	Reporter.log("Method b is running", true);
}
@Test
public void c() {
	Reporter.log("Method c is running", true);
}

}
