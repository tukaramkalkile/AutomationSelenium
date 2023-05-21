package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverMethod {
	public static void main(String[] args) throws InterruptedException {
		// To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// To Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		// To Maximize Chrome Browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// To Launch Web Application
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAjwuqiiBhBtEiwATgvixBk5G8sC-u8Wi6yMHoVAa9Xx29SkA39vW7XWC4PDiKUna-8HMe5xzhoCwo4QAvD_BwE");
	
		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[@title='Coins']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//strong[text()='24 Kt (995)']/ancestor::div[@class='metal-purity']/following::span[text()='1 gram']")).click();
		WebElement coin = driver.findElement(By.xpath("//div[@class='mousetrap']"));
		if(coin.isDisplayed())
		{
			System.out.println("Coin is displyed Successfully");
		}
		else {
			System.out.println("Coin is not Displyed");
		}
		
		
		Thread.sleep(2000);
		driver.close();
	}
}
