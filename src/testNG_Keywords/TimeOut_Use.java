package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut_Use {
  @Test
  public void a() {
  Reporter.log("Method a is running", true);
  }
@Test(timeOut = 1000)
public void b() throws InterruptedException {
	Thread.sleep(2000);
	Reporter.log("Method b is running", true);
}
@Test
public void c() {
	Reporter.log("Method c is running", true);
}

}
