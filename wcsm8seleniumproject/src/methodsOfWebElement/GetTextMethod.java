package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTextMethod {

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
		
		String text1 = driver.findElement(By.xpath("//td[text()='Username:']")).getText();
		System.out.println(text1);
		String text2 = driver.findElement(By.xpath("//td[text()='Password:']")).getText();
		System.out.println(text2);
		String text3 = driver.findElement(By.id("loginbutton")).getText();
		System.out.println(text3);
		Thread.sleep(2000);
		driver.close();


	}

}
