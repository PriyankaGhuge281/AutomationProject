package testNG_xml_use;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
  @Test(groups= {"Saving Account"})
  public void a() {
Reporter.log("Method a is running", true);  
  }
@Test(groups= {"Account Opening"})
public void b() {
	Reporter.log("Mehod b is Running", true);
}
@Test(groups= {"Saving Account"})
public void c() {
	Reporter.log("Method c is Running",true);
}
@Test
public void d() {
	Reporter.log("Method d is Running", true);
}
}
