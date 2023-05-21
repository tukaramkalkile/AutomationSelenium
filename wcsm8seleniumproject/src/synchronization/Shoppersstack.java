package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoppersstack {
	public static void main(String[] args) throws InterruptedException {
		//Implicit  Wait Method
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		
		//Applying the implicitly Wait to appear The Webelement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));


		driver.findElement(By.xpath("//div[@class='featuredProducts_footerLeft__bCBJ3']/descendant::span[text()='NOSIE']")).click();
		
		driver.findElement(By.xpath("//input[@name='Check Delivery']")).sendKeys("413033");
		
		//Applying the explicitly Wait to appear The Webelement
		
		waitMethod(driver, 30, "Check").click();
		
		Thread.sleep(2000);
		driver.quit();
	}
		public static WebElement waitMethod(WebDriver driver,int sec,String value) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(value)));			
			return element;

			
			
		}
}
