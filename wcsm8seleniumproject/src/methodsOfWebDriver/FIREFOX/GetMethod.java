package methodsOfWebDriver.FIREFOX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		// IT IS USED TO LAUNCH WEB APPLICATION

		//To avoid IllegalStateExeception
		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");


		//TO Launch the Firefox Browser
		WebDriver driver = new FirefoxDriver();

		//To Maximize Firefox Browser
		driver.manage().window().maximize();

		//To Stop Execution for 3seconds
		Thread.sleep(3000);

		//To Launch Web Application
		driver.get("http://omayo.blogspot.com/");
	}

}
