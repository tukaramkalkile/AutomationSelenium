package methodsOfWebDriver.CHROME;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		// IT IS USED TO LAUNCH WEB APPLICATION

		//To avoid IllegalStateExeception
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//To avoid ConnectionFailedExeception
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		//TO Launch the Chrome Browser
		WebDriver driver = new ChromeDriver(co);
		
		//To Maximize the Chrome Browser
		driver.manage().window().maximize();
		
		//To Stop execution for 2seconds
		Thread.sleep(3000);
		
		//To Launch Web Application
		driver.get("http://omayo.blogspot.com/");
	}

}
