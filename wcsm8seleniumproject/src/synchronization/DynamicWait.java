package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWait {
	public static void main(String[] args) {
		//Implicit  Wait Method
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		
		//Applying the implicitly Wait to appear The Webelement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Rahul");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rahul@12345");
		
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		
		driver.close();
	}

}
