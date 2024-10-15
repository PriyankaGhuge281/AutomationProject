package testNG_Keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutKeyword {
  @Test
  public void a() {
  Assert.fail();
	  Reporter.log("method a is running",true);
  }

  @Test(dependsOnMethods = {"a","c"})
  public void b() throws InterruptedException {
  Thread.sleep(1000);
	Reporter.log("method b is running",true);
  }
  @Test                                                              
  public void c() {
  Reporter.log("method c is running",true);
  }
  @Test
  public void d() {
  Reporter.log("method d is running",true);
  }
}
