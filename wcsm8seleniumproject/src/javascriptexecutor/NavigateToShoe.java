package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateToShoe {
	public static void main(String[] args) throws InterruptedException {
		// To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");

		// To Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver(co);

		// To Maximize Chrome Browser
		driver.manage().window().maximize();

		Thread.sleep(2000);

		// To Launch Web Application
		driver.get("https://in.puma.com/in/en/sports/sports-training/training-shoes");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement shoe = driver.findElement(By.xpath("//a[@class='tw-hqslau tw-xbcb1y']/descendant::span[text()='PUMA Black-Cayenne-Wood Violet']"));

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Point loc = shoe.getLocation();

		int yaxis = loc.getY();System.out.println(yaxis);

		jse.executeScript("window.scrollBy(0,"+yaxis+(-500)+")");

		Thread.sleep(2000);
		driver.close();

	}

}
