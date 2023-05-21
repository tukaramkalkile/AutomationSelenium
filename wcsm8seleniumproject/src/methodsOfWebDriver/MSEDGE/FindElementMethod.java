package methodsOfWebDriver.MSEDGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class FindElementMethod {
	public static void main(String[] args) throws InterruptedException {
	// IT IS USED TO LAUNCH WEB APPLICATION

			//To avoid IllegalStateExeception
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			
			EdgeOptions eo = new EdgeOptions();
			eo.addArguments("--remote-allow-origins=*");

			//TO Launch the Chrome Browser
			WebDriver driver = new EdgeDriver(eo);

			//To Maximize MSEdge Browser
			driver.manage().window().maximize();

			//To stop Execution for 3seconds
			Thread.sleep(3000);

			//To Launch Web Application
			driver.get("http://127.0.0.1/login.do;jsessionid=2ca7gsctdgtjl");

			Thread.sleep(1000);
			WebElement usernameTextBox = driver.findElement(By.xpath("//input[@name='username']"));
			usernameTextBox.sendKeys("admin");
			System.out.println(usernameTextBox);

			Thread.sleep(2000);
			driver.close();}

}
