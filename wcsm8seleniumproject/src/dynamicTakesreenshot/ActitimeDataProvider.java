package dynamicTakesreenshot;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActitimeDataProvider {
	  static WebDriver driver;	
		@BeforeTest
		public void property()
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		}
		
		@BeforeMethod
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://127.0.0.1/login.do;jsessionid=23k0ge00q6pwr");
		}
		
		@DataProvider(name="testActiTime")
		public Object [] [] dataProvider(){
			
			Object [] [] dataprovider=new Object [5] [2];
			
			dataprovider[0][0]="Admin$";
			dataprovider[0][1]="Manager$";
			
			dataprovider[1][0]="Admin123";
			dataprovider[1][1]="Manager123";
			
			dataprovider[2][0]="Admin@";
			dataprovider[2][1]="Manager@";
			
			dataprovider[3][0]="Admi_n";
			dataprovider[3][1]="Manage_r";
			
			dataprovider[4][0]="ADMIN";
			dataprovider[4][1]="MANAGER";
			
			return dataprovider;

		}
		
		@Test(dataProvider = "testActiTime")
		public void loginInvalid(String usn,String pass) throws InterruptedException {
			
			driver.findElement(By.name("username")).sendKeys(usn);
			driver.findElement(By.name("pwd")).sendKeys(pass);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();			
		}
		
		@AfterMethod
		public void tearDown() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.quit();
		}
}
