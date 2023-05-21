package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		
	
	// To avoid IllegalStateExeeption
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	// To Launch Chrome Browser
	WebDriver driver = new ChromeDriver();

	// To Maximize Chrome Browser
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	// To Launch Web Application
	driver.get("https://www.netflix.com/in/login");
	
	driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("Rahul");

	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rahul@1234456");
	
	driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).submit();
	
	Thread.sleep(3000);
	driver.close();

}
}
