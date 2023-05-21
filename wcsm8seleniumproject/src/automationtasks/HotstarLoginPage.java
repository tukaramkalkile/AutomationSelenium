package automationtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HotstarLoginPage {

		public static void main(String[] args) throws InterruptedException {
			// System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			 
			WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Have a Facebook/Email account?']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='emailID']")).sendKeys("rahul@gmail.com",Keys.ENTER);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rahul@gmail251998",Keys.ENTER);
			
			driver.close();
			
		}
}
