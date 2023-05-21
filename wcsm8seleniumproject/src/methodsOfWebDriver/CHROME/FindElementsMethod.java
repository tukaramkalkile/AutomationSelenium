package methodsOfWebDriver.CHROME;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementsMethod {

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
		Thread.sleep(1000);

		//To Launch Web Application
		driver.get("https://www.google.com/");

		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("pohadish");

		Thread.sleep(2000);
		List<WebElement> pohaOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		Thread.sleep(2000);

		//By Using ForLoop
		for(int i=1;i<pohaOptions.size()-2;i++) 
		{
			String poha = pohaOptions.get(i).getText();

			System.out.println(i+" "+poha);
			Thread.sleep(2000);


		}
		
		//By Using Foreach Loop
		
		for(WebElement poha:pohaOptions)
		{
			System.out.println("--> "+" "+poha.getText());
			Thread.sleep(2000);
			
		}

		Thread.sleep(2000);
		driver.close();





	}



}
