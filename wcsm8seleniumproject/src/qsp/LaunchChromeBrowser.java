package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser {

	
	public static void main(String[] args) throws InterruptedException {
		
	    //To avoid IllegalStateException
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//To avoid ConnectionFailedException
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//To launch Chrome Browser
		ChromeDriver driver = new ChromeDriver(co);
		
		//TO maximize Chrome browser
		driver.manage().window().maximize();
		
		//To Stop Execution for 2seconds
        Thread.sleep(2000);
        
        //To Close ChromeBrowser
		driver.close();
	}

}
