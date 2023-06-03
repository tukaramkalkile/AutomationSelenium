package annotationsPackage;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class Annotations {
	
	  @Test
	  public void testMethod()
	  {
		  Reporter.log("TestMethod Annotations",true);

	  }
	 @BeforeMethod
	  public void beforeMethod() {
		  Reporter.log("BeforeMethod Annotations ",true);
	  }

	  @AfterMethod
	  public void afterMethod() {
		  Reporter.log("AfterMethod Annotations ",true);
	  }

	  @BeforeClass
	  public void beforeClass() {
		  Reporter.log("BeforeClass Annotations ",true);
	  }

	  @AfterClass
	  public void afterClass() {
		  Reporter.log("AfterClass Annotations ",true);
	  }

	  @BeforeTest
	  public void beforeTest() {
		  Reporter.log("BeforeTest Annotations ",true);
	  }

	  @AfterTest
	  public void afterTest() {
		  Reporter.log("AfterTest Annotations ",true);
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  Reporter.log("BeforeSuite Annotations ",true);
	  }

	  @AfterSuite
	  public void afterSuite() {
		  Reporter.log("AfterSuite Annotations ",true);
	  }

}
