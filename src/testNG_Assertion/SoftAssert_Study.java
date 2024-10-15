package testNG_Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Study {
  @Test
  public void f() {
  String a="software";
  String b="velocity";
  SoftAssert soft=new SoftAssert();
  soft.assertNotEquals(a, b,"both are equal TC failed");
  soft.assertNull(b, "value is not null,Tc failed");
  soft.assertAll();
  }
  @Test
  public void f1() {
  String a="pune";
  String b="testing";
  SoftAssert soft=new SoftAssert();
  soft.assertNotEquals(a, b,"both are equal TC failed");
  soft.assertNull(b, "value is not null,Tc failed");
  soft.assertAll();

  }

}
