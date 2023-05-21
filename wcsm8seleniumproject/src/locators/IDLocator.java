package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IDLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		driver.findElement(By.id("id_userLoginId")).sendKeys("manish@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("maygaribhu123$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
