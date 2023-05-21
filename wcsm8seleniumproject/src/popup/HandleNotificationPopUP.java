package popup;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleNotificationPopUP {
	public static void main(String[] args) throws InterruptedException {
		// To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");

		// To Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver(co);

		// To Maximize Chrome Browser
		driver.manage().window().maximize();


		// To Launch Web Application
		driver.get("https://in.puma.com/in/en/sports/sports-training/training-shoes");
		driver.manage().window().maximize();
		 
		driver.close();
 
	}

}
