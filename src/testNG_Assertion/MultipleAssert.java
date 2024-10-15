package testNG_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleAssert {
  @Test
  public void f() {
  
	  String a="velocity";
	  String b="katraj";
	  Assert.assertNotEquals(a, b,"both are  equals,TC failed");
     Assert.assertNull(b, "value is not null,TC failed");  
 }
@Test
public void f1() {
	String a="pune";
	String b="katraj";
	Assert.assertEquals(a,b,"both are not equals TC failed");
}



}
