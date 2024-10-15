package testNG_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void demo() {
System.out.println("Hi this is printing statement");
Reporter.log("Hi this is reporter with single parameter");
Reporter.log("Hi this is reporter with two parametre", true);
  
  
  
  
  }
}
