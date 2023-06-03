package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
		//It is used to execute method or annotation multiple time
	
  @Test(invocationCount = 2000)
  public void method1() {
	  Reporter.log("Login Test case!!!",true);
  }
}
