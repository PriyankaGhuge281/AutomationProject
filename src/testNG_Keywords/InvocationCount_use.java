package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount_use {
  @Test(invocationCount = 3)
  public void a() {
  Reporter.log("Method a is running", true);
  }
@Test(invocationCount = 2)
public void b() {
	Reporter.log("Method b is running", true);
}
@Test
public void c() {
	Reporter.log("Method c is running", true);
}
@Test
public void d() {
	Reporter.log("Method d is running", true);
}
}
