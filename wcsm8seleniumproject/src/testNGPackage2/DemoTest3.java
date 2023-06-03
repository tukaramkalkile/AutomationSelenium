package testNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest3 {
	 @Test
	  public void g() {
		  Reporter.log("g method from DemoTest1",true);
	  }
	  
	  @Test
	  public void h() {
		  Reporter.log("h method from DemoTest1",true);
	  }
	  
	  @Test
	  public void i() {
		  Reporter.log("i method from DemoTest1",true);
	  }
}
