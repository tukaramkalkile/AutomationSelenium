package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

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
	
	WebElement usnTB = driver.findElement(By.xpath("//input[@name='userLoginId']"));

	WebElement passTB = driver.findElement(By.xpath("//input[@name='password']"));

	WebElement loginBT = driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']"));
	
		if(usnTB.isDisplayed())
		{
			driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("Rahul");
		}
		else
		{
			System.out.println("We Will Get Exception");
		}
		if(passTB.isDisplayed())
		{
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rahul@12345");
		}
		else
		{
			System.out.println("We Will Get Exception");
		}
		if(loginBT.isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click();
		}
		else
		{
			System.out.println("We Will Get Exception");
		}
		
		Thread.sleep(2000);
		driver.close();
	
	}
	
}
