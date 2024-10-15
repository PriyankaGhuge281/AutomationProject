package testNG_xml_use;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
  @Test(groups= {"Account Opening","Saving Account"})
  public void e() {
  Reporter.log("Method e is Running", true);
  }

@Test(groups= {"Account Opening"})
public void f() {
	Reporter.log("Method f is Running", true);
}
@Test(groups= {"Saving Account"})
public void g() {
	Reporter.log("Method g is Running", true);
}
@Test
public void h() {
	Reporter.log("Method h is Running", true);
}
}
