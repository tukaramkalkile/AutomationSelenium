package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	static WebDriver driver;

	@Test
	@Parameters({"browser","url","Vusername","Vpassword"})
	public void method1(String browser,String url,String usn,String pwd) throws InterruptedException {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			driver.findElement(By.id("loginbutton")).click();
			Thread.sleep(1200);
			driver.close();
			}
		else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			 driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			driver.findElement(By.id("loginbutton")).click();
			Thread.sleep(1200);
			driver.close();
			
			
		}
		else {
			Reporter.log("Invalid Browser",true);
		}

	}
}
