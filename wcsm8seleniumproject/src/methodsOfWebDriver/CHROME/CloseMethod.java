package methodsOfWebDriver.CHROME;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	// IT IS USED TO CLOSE THE PARENT BROWSER

	public static void main(String[] args) throws InterruptedException {

		//To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//To avoidConnectionFailedExexption
	//	ChromeOptions co = new ChromeOptions();
	//	co.addArguments("--remote-allow-origins=*");

		//To Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		//To Maximize Chrome Browser
		driver.manage().window().maximize();

		//TO Launch a Web Application
		driver.get("http://omayo.blogspot.com/");

		//To Stop Execution for seconds
		Thread.sleep(2000);

		//To close Web Browser
		driver.close();

	}

}
