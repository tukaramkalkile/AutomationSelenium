package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManageMethod {
	// IT IS USED TO MANAGE BROWSER

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

		//To Set Size of Chrome Browser
		Dimension targetsize = new Dimension(700,500);
		Thread.sleep(5000);
		driver.manage().window().setSize(targetsize);

		//To Set Position of Chrome Browser
		Point targetposition = new Point(450,200);
		Thread.sleep(5000);
		driver.manage().window().setPosition(targetposition);

		//To Stop Execution for seconds
		Thread.sleep(2000);

		//To close Web Browser
		driver.close();

	}

}
