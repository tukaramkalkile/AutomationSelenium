package qsp;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {

	public static void main(String[] args) throws InterruptedException {

		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Browser name");
			
			String browservalue = sc.next();
			
			if(browservalue.equalsIgnoreCase("chrome"))
			{
				//To avoid IllegalStateExecption
			    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			    
			    //To avoid ConnectionFailedException
			    ChromeOptions co = new ChromeOptions();
			    co.addArguments("--remote-allow-origins=*");
			    
			    //To Launch ChromeBrowser
			    ChromeDriver driver = new ChromeDriver(co);
			    
			    //To Maximize ChromeBowser
			    driver.manage().window().maximize();
			    
			    //To Stop execution for 2seconds
			    Thread.sleep(2000);
			    
			    //To Close ChromeBrowser
			    driver.close();
			    
			}
			else if(browservalue.equalsIgnoreCase("firefox"))
			{
				//To avoid IllegalStateExcecption
				//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				
				//To Launch Firefox Browser
				FirefoxDriver driver = new FirefoxDriver();
				
				//To maximize firefox browser
				driver.manage().window().maximize();
				
				//To Stop Execution for 2seconds
				Thread.sleep(2000);
				
				//To close firefox browser
				driver.close();
				
			}
			else if(browservalue.equalsIgnoreCase("msedge")) {
				
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
			else
			{
				System.out.println("Enter Valid Browser Name Please !!!!");
				
			}
		}
		

	}

}
