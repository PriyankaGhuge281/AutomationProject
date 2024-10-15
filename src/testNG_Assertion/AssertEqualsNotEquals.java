package testNG_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsNotEquals {
  @Test
  public void f() {
  
  String a="Pune";
  String b= "Pune";
  String c="Velocity";
 // Assert.assertEquals(a, b,"Both are not equal,TC failed");
  Assert.assertNotEquals(a, c,"both are equal,TC passed");
  }
}
