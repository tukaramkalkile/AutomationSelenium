package xpathlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathUniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disabled-notification=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("http://127.0.0.1/login.do;jsessionid=2bsl4fr38d06w");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		Thread.sleep(2000);

		driver.quit();
	}

}
