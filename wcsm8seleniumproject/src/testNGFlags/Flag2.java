package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
		//To use to  Enabled or Disabled a Test case
	
	 @Test(enabled = true,description = "Login Method")
	  public void method1() {
		  Reporter.log("Method 1 Login",true);
	  }
	 @Test(enabled = true,description = "Logout Method")
	  public void method2() {
		  Reporter.log("Method 1 Login",true);
	  }
}
