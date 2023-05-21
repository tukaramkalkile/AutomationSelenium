package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigateToNEWS {

	public static void main(String[] args) throws InterruptedException {
		// To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// To Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// To Maximize Chrome Browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// To Launch Web Application
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement news = driver.findElement(By.xpath("//h2[text()='News']"));

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Point loc = news.getLocation();

		int yaxis = loc.getY();System.out.println(yaxis);

		jse.executeScript("window.scrollBy(0,"+yaxis+(-250)+")");
		Actions act = new Actions(driver);
		Thread.sleep(2000);

		for (int i = 0; i <= 2; i++) {
			act.clickAndHold(news).perform();

		}


		Thread.sleep(2000);
		driver.close();

	}

}
