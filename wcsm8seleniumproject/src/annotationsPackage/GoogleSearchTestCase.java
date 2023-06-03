package annotationsPackage;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTestCase extends BaseTest {
	  @Test(enabled = false,description = "The Method Search for JAVA !!")
	  public void search1() {
		  driver.switchTo().activeElement().sendKeys("JAVA",Keys.ENTER);
	  }
	  
	  @Test(description = "The Method Search for SQL !!")
	  public void search2()
	  {
		  driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
	  }
	  
	  @	Test(description = "The Method Search for SELENIUM !!")
	  public void serach3()
	  {
		  driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
	  }
}
