package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		  //To avoid IllegalStateException
	      System.setProperty("webdriver.geckodiver.driver","./drivers/geckodriver.exe");
				
		
		// TO launch firefox browser
		FirefoxDriver driver = new FirefoxDriver();
		
		//To maximize firefox browser
		driver.manage().window().maximize();
		
		//To stop Execution for 2seconds
		Thread.sleep(2000);
		
		//To Close the Firefox Browser
		driver.close();

	}

}
