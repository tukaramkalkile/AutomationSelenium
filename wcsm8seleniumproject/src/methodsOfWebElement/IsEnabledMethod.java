package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		
	
	// To avoid IllegalStateExeeption
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	// To Launch Chrome Browser
	WebDriver driver = new ChromeDriver();

	// To Maximize Chrome Browser
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	// To Launch Web Application
	driver.get("https://www.instagram.com/");
	
	WebElement loginbutton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	
	boolean verify1 = loginbutton.isEnabled();
	
	System.out.println(verify1);
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("fdgsvzkedc glaw");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dfverknb a;kloemv ");
	
	boolean verify2 = loginbutton.isEnabled();
	
	System.out.println(verify2);
	
	driver.close();

	
}

}
