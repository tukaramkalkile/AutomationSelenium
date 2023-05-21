package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirAsiaDynamicWebPage {
	public static void main(String[] args) throws InterruptedException {
		// IT IS USED TO LAUNCH WEB APPLICATION

		//To avoid IllegalStateExeception
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//To avoid ConnectionFailedExeception
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		//TO Launch the Chrome Browser
		WebDriver driver = new ChromeDriver(co);

		//To Maximize the Chrome Browser
		driver.manage().window().maximize();

		//To Stop execution for 2seconds
		Thread.sleep(2000);

		//To Launch Web Application
		driver.get("https://www.airasia.co.in/home");
		Thread.sleep(2000);
		co.addArguments("--disabled-notification=*");
		driver.findElement(By.xpath("//div[text()='Fly to']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='New Delhi']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Special Fares']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains(@alt,'minus') and (@id='adult')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains(@alt,'plus') and (@id='student') ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='flight-search-date-picker-wrapper']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Search Flights']")).click();
		Thread.sleep(10000);

		driver.close();


	}

}
