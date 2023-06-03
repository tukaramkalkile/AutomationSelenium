package iframe;

import java.time.Duration; 
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindow {
	public static void main(String[] args) {

		//Implicit  Wait Method
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("http://127.0.0.1/login.do;jsessionid=23k0ge00q6pwr");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.xpath("//a[text()='Insert existing tasks']")).click();
			//Handle or address of window
			String handleParent = driver.getWindowHandle();
			System.out.println(handleParent);
			
			//Handle or address of multiple window
			Set<String> handleChild = driver.getWindowHandles();
			
			for(String wh:handleChild)
			{
				System.out.println(wh);
			}
			
	}

}
