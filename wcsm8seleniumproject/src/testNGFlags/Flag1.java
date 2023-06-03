package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	//To use to  describe a Test case

	
  @Test(description = "The Method Performs Login !!")
  public void method1() {
	  Reporter.log("Method 1 Login",true);
  }
}
