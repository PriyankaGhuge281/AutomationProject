package testNG_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullNotNull {
  @Test
  public void f() {
  
  String a="Pune";
  String b=null;
  //Assert.assertNotNull(b, "Value is null,TC failed");
  Assert.assertNull(a, "Value is not null, Tc failed");
  
  }
}
