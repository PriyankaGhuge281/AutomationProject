package testNG_xml_use;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 {
  @Test(groups = {"Account Opening"})
  public void a() {
 Reporter.log("Merhod a is running",true);
  }
@Test(groups={"Saving Account"})
public void b() {
	Reporter.log("Method b is running",true);
}
@Test
public void c() {

	Reporter.log("Method c is running",true);
}
@Test
public void d() {
	Assert.fail();
	Reporter.log("Method d is running", true  );
}
}
