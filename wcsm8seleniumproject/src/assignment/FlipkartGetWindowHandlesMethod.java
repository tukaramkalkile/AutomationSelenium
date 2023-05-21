package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartGetWindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
		// To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// To Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// To Maximize Chrome Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// To Launch Web Application
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement link = driver.findElement(By.xpath("//input[@name='q']"));
		link.sendKeys("S23 Moblies",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_4rR01T'])[1]")).click();
		//Handle or address of window
		String handleParent = driver.getWindowHandle();
		System.out.println(handleParent);
		//Handle or address of multiple window
		Set<String> handleChild = driver.getWindowHandles();
		for(String wh:handleChild)
		{
			if (!handleParent.equals(wh)) {
				driver.switchTo().window(wh);
			}
		}
		String childTitle = driver.getTitle();
		if (childTitle.equals("SAMSUNG Galaxy S23 5G ( 128 GB Storage, 8 GB RAM ) Online at Best Price On Flipkart.com")) {
			System.out.println();
		}
		WebElement color = driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Point loc = color.getLocation();
		int yaxis = loc.getY();
		jse.executeScript("window.scrollBy(0,"+yaxis+(-500)+")");
		Thread.sleep(3000);
		color.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_1fGeJ5']")).click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,"+yaxis+(-500)+")");
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("411034");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		WebElement remove = driver.findElement(By.xpath("//div[text()='Remove']"));
		jse.executeScript("window.scrollBy(0,"+yaxis+(-500)+")");
		Thread.sleep(2000);
		remove.click();
		driver.findElement(By.xpath("(//div[text()='Remove'])[1]")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
