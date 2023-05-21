package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CSSSelectorLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://www.netflix.com/in/login");

		Thread.sleep(2000);
		driver.findElement(By.name("userLoginId")).sendKeys("rahul@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys("rahul@12344");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
		Thread.sleep(6000);

		driver.close();
	}
}
