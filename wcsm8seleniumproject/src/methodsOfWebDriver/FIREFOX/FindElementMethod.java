package methodsOfWebDriver.FIREFOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementMethod {
	public static void main(String[] args) throws InterruptedException {
		// IT IS USED TO LAUNCH WEB APPLICATION

		//To avoid IllegalStateExeception
		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");


		//TO Launch the Firefox Browser
		WebDriver driver = new FirefoxDriver();

		//To Maximize Firefox Browser
		driver.manage().window().maximize();

		//To Stop Execution for 3seconds
		Thread.sleep(3000);

		//To Launch Web Application
		driver.get("http://127.0.0.1/login.do;jsessionid=2ca7gsctdgtjl");

		Thread.sleep(1000);
		WebElement usernameTextBox = driver.findElement(By.xpath("//input[@name='username']"));
		usernameTextBox.sendKeys("admin");
		System.out.println(usernameTextBox);

		Thread.sleep(2000);
		driver.close();
		}
}
