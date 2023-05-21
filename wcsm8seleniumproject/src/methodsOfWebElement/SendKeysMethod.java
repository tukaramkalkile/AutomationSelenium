package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendKeysMethod {

	public static void main(String[] args) throws InterruptedException {
		        //To avoid IllegalStateExeeption
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

				//To avoidConnectionFailedExexption
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");

				//To Launch Chrome Browser
				WebDriver driver = new ChromeDriver(co);

				//To Maximize Chrome Browser
				driver.manage().window().maximize();

				//To Launch Web Application
				driver.get("http://127.0.0.1/login.do;jsessionid=2cb3oayrilo41");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				
				driver.findElement(By.name("username")).sendKeys("admin");
				
				driver.findElement(By.name("pwd")).sendKeys("manager");
				
				Thread.sleep(2000);
				driver.close();

		

	}

}
