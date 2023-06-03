package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	
	
  @Test(description = "Login TestCase")
  public void loginMethod() {
	  Reporter.log("Login Performed",true);
  }
  
  @Test(description = "CreateUser TestCase",dependsOnMethods = "loginMethod")
  public void createUserMethod() {
	  Reporter.log("Usercreated ",true);

  }
  
  @Test(description = "Logout TestCase",dependsOnMethods = "createUserMethod")
  public void logoutMethod() {
	  Reporter.log("Logout Performed",true);

  }
  
}
