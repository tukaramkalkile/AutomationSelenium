package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {
	public static void main(String[] args) throws InterruptedException {
		// To avoid IllegalStateExeeption
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

				// To Launch Chrome Browser
				ChromeDriver driver = new ChromeDriver();

				// To Maximize Chrome Browser
				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("file:///C:/Users/Tukaram%20K%20Kalkile/OneDrive/Desktop/wcsm8_work%20space/wcsm8seleniumproject/HTML/Frame.html");

				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				
				 Thread.sleep(2000);
				 WebElement usn = driver.findElement(By.id("i1"));
				 usn.sendKeys("Admin");
				 driver.switchTo().frame("Frname");
				 WebElement pwd = driver.findElement(By.id("i2"));
				 pwd.sendKeys("Rahul$12345");
				 Thread.sleep(2000);
				 pwd.clear();
				 driver.switchTo().parentFrame();
				 Thread.sleep(2000);
				 usn.clear();
				 Thread.sleep(2000);
				 driver.close();
				 
	}

}
