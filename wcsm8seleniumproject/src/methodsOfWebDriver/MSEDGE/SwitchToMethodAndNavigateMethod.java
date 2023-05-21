package methodsOfWebDriver.MSEDGE;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchToMethodAndNavigateMethod {

	public static void main(String[] args) throws InterruptedException {

		//To avoid IllegalStateExeeption
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");


		//To Launch MSEdge Browser
		WebDriver driver = new EdgeDriver();

		//To Maximize MSEdge Browser
		driver.manage().window().maximize();

		//TO Launch a Web Application
		driver.navigate().to("https://www.google.com/");

		//To use SwicthTo Method
		driver.switchTo().activeElement().sendKeys("Webtechnology",Keys.ENTER);

		//To Stop Execution for seconds
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Selenium.dev",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		driver.close();

	}


}
