package pompackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=23k0ge00q6pwr");
		Thread.sleep(1000);
		 WebElement usernameTB = driver.findElement(By.name("username"));
		 usernameTB.sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton"));
		Thread.sleep(1000);
		driver.navigate().refresh();
		usernameTB.clear();
		Thread.sleep(1000);
		driver.close();
}}
