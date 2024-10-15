package testNG_xml_use;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void a() {
  
  Reporter.log("Method a is running",true);
  }
@Test
public void b() {
	Reporter.log("Method b is running",true);
}
@Test
public void c() {
	Reporter.log("Method c is running",true);
}
@Test
public void d() {
	Reporter.log("Method d is running",true);
}


@Test
public void z() {
	Reporter.log("Method z is running",true);
}








}
