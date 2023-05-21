package xpathlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathTextFunction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		co.addArguments("--disabled-notification=*");
		driver.get("https://www.adidas.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Football Ball",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='OCEAUNZ PRO FOOTBALL']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='UCL Training Istanbul Ball']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.close();

	}
}
