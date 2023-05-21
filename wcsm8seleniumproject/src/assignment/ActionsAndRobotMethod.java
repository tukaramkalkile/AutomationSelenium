package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndRobotMethod {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// To Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		// To Maximize Chrome Browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// To Launch Web Application
		driver.get(
				"https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAjwxr2iBhBJEiwAdXECw3W-RMxIGx6z0H0AVCXwvrQYoNW1Ov7GG2eszNfoFfUm1_rehRWSihoCqlQQAvD_BwE");

		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		WebElement watchJewellrey = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
		Actions act = new Actions(driver);
		act.moveToElement(watchJewellrey).perform();
		Thread.sleep(200);
		driver.findElement(By.xpath("//a[@title='Band']")).click();

		WebElement target1 = driver.findElement(By.xpath("//div[text()='Filter by']"));
		Thread.sleep(2000);

		for (int i = 0; i <= 2; i++) {
			act.clickAndHold(target1).perform();

		}
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		driver.findElement(By.name("search_query")).click();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		driver.findElement(By.name("submit_search")).submit();
		
		Thread.sleep(2000);
		driver.close();
	
		
		
	}

}
