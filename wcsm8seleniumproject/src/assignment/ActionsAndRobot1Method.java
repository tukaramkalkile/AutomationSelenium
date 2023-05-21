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

public class ActionsAndRobot1Method {

	public static void main(String[] args) throws InterruptedException, AWTException {
		        // To avoid IllegalStateExeeption
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

				// To Launch Chrome Browser
				WebDriver driver = new ChromeDriver();

				// To Maximize Chrome Browser
				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// To Launch Web Application
				driver.get("https://www.selenium.dev/");

				Thread.sleep(2000);
				WebElement target = driver.findElement(By.xpath("//div[@class='row justify-content-center td-box--100 pt-5']"));
				Actions act = new Actions(driver);
				act.contextClick(target).perform();
				Robot r = new Robot();
				for(int i=0;i<10;i++) {
					Thread.sleep(500);
					r.keyPress(KeyEvent.VK_DOWN);
					}
				Thread.sleep(500);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(5000);
				driver.close();
				
				
				
	}

}
