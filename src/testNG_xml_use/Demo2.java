package testNG_xml_use;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void e() {

  Reporter.log("Method e is running");
  }
@Test
public void f() {
	Reporter.log("Method f is running",true);
}
@Test
public void g() {
	Reporter.log("Method g is running",true);
}
@Test
public void h() {
	Reporter.log("Method h is running",true);
}
@Test
public void i() {
	Reporter.log("Method i is running",true);
}
} 