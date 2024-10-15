package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.Listener.class)
public class Demo {
  @Test(dependsOnMethods = {"validPinCodeATM"})
  public void moneyTransferATM() {
  
	  Reporter.log("money transfer ATM",true);
  
  }
@Test
public void validPinCodeATM() {
	Assert.fail();
	Reporter.log("Validate pin ATM",true);
}


}
