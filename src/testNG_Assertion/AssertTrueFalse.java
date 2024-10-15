 package testNG_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalse {
  @Test
  public void f() {
  
	  boolean a=true;
	  boolean b=false;
	  
	 // Assert.assertTrue(a, "value is false, TC failed");
	  Assert.assertFalse(b, "Value is true ,Tc failed");
  
  
  
  }
}
