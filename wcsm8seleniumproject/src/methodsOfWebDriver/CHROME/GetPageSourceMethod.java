package methodsOfWebDriver.CHROME;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPageSourceMethod {
	// IT IS USED TO GET PAGESOURCE OF CURRENT WEB PAGE

	public static void main(String[] args) throws InterruptedException {

		//To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//To avoidConnectionFailedExexption
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		//To Launch Chrome Browser
		WebDriver driver = new ChromeDriver(co);

		//To Maximize Chrome Browser
		driver.manage().window().maximize();

		//To Launch Web Application
		driver.get("https://www.instagram.com/");

		//TO Get PageSource of Web Application
		String scode = driver.getPageSource();
		System.out.println(scode);

		//To Stop Execution for seconds
		Thread.sleep(2000);

		//To close Web Browser
		driver.close();

	}
}
