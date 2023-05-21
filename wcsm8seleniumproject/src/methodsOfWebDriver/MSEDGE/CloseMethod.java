package methodsOfWebDriver.MSEDGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		// IT IS USED TO LAUNCH WEB APPLICATION

		//To avoid IllegalStateExeception
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");


		//TO Launch the Chrome Browser
		WebDriver driver = new EdgeDriver();
		
		//To Maximize MSEdge Browser
		driver.manage().window().maximize();
		
		//To Launch Web Application
		driver.get("http://omayo.blogspot.com/");
		
		//To stop Execution for 3seconds
		Thread.sleep(3000);
		
		//To Close MSEDGE Browser
		driver.close();
	}




}
