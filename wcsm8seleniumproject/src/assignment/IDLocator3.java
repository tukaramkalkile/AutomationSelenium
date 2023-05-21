package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IDLocator3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("http://127.0.0.1:5500/PROJECTS/PROJECT-13/index.html");
		Thread.sleep(2000);
		driver.findElement(By.id("i1")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.id("i2")).sendKeys("manager");
		Thread.sleep(2000);
		driver.close();
	}

}
