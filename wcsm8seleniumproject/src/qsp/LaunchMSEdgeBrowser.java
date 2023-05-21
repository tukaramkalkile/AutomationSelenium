package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchMSEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//To avoid IllegalStateExeception
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		
		//To Launch MSEdge Browser
		EdgeDriver driver = new EdgeDriver();
		 
		//To maximize MSEdge Browser
		driver.manage().window().maximize();
		
		//To Stop Execution for 2seconds
		Thread.sleep(2000);
		
		//To close MSEdge Browser
		driver.close();
		

	}

}
