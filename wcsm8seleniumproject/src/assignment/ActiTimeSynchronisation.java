package assignment;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeSynchronisation 

{public static void main(String[] args) throws InterruptedException {
	//Implicit  Wait Method
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("http://127.0.0.1/login.do;jsessionid=23k0ge00q6pwr");

	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	String titlePage = driver.getTitle();

	if(waitMethod(driver, 60, titlePage))
	{   			
		System.out.println("TEST CASE 01 PASSED SUCCESSFULLY ");
		System.out.println(titlePage);


		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		String LoginPage = driver.getTitle();


		if(waitMethod(driver, 60, LoginPage))
		{
			System.out.println("TEST CASE 02 PASSED SUCCESSFULLY");
			System.out.println(LoginPage);

			driver.quit();
		}

	}
	else
	{
		System.out.println("TEST CASE FAILED SUCCESSFULLY");
		driver.quit();
	}


}	 public static Boolean waitMethod(WebDriver driver,int sec,String title)
{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
	Boolean titleOfPage = wait.until(ExpectedConditions.titleContains(title));
	return titleOfPage;
}

}
