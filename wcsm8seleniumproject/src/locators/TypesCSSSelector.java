package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TypesCSSSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("http://127.0.0.1/login.do");

		//CSS SELECTOR BY USING UPPERCASE ^ = FIRSTWORD
		Thread.sleep(2000);driver.findElement(By.cssSelector("input[class^='t']")).sendKeys("Admin");
		Thread.sleep(2000);

		//CSS SELECTOR BY USING DOLLAR $ = LASTWORD
		
		driver.findElement(By.cssSelector("input[type$='word']")).sendKeys("manager");
		Thread.sleep(2000);

		//CSS SELECTOR BY USING UPPERCASE * = INBETWEENWORD
		
		driver.findElement(By.cssSelector("a[id*='inBu']")).click();
		Thread.sleep(2000);
		
		driver.close();
		}

}
