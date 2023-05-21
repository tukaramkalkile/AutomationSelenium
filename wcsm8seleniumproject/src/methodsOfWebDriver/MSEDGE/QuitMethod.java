package methodsOfWebDriver.MSEDGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class QuitMethod {
	//IT IS USED TO CLOSE THE PARENT AND CHILD BROWSER
	public static void main(String[] args) throws InterruptedException {
		// TO IllegalStateExecption
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");

		//To Launch MSEDGE browser
		WebDriver driver = new EdgeDriver();

		//To Maximize MSEDGE Browser
		driver.manage().window().maximize();

		//To Launch Web Application
		driver.get("http://omayo.blogspot.com/");

		//To Launch One more Web Application USING Previous Web Application
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();

		//To Stop Execution for 7seconds
		Thread.sleep(7000);

		//To Quit From Web Application
		driver.quit();

	}

}
