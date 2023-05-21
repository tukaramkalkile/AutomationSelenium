package methodsOfWebDriver.CHROME;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	public static void main(String[] args) throws InterruptedException {
		// To avoid IllegalStateExeeption
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

				// To Launch Chrome Browser
				ChromeDriver driver = new ChromeDriver();

				// To Maximize Chrome Browser
				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// To Launch Web Application
				driver.get("http://omayo.blogspot.com/");
				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				WebElement link = driver.findElement(By.xpath("//a[text()='Open a popup window']"));

				JavascriptExecutor jse = (JavascriptExecutor)driver;
				Point loc = link.getLocation();

				int yaxis = loc.getY();

				jse.executeScript("window.scrollBy(0,"+yaxis+(-500)+")");
				Thread.sleep(2000);
				//Click on link and get child window
				link.click();
				
				//Handle or address of window
				String handle = driver.getWindowHandle();
				System.out.println(handle);
				
				Thread.sleep(2000);
				driver.quit();
				
				
	}

}
