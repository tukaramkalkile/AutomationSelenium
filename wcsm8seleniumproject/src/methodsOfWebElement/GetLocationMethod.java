package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetLocationMethod {

	public static void main(String[] args) {
		// To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// To avoidConnectionFailedExexption
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		// To Launch Chrome Browser
		WebDriver driver = new ChromeDriver(co);

		// To Maximize Chrome Browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// To Launch Web Application
		driver.get("https://www.selenium.dev/");

		WebElement text = driver.findElement(By.xpath("//h2[text()='Getting Started']"));

		Point loc = text.getLocation();

		int xaxis = loc.getX();
		int yaxis = loc.getY();
		System.out.println("The X axis is :" + xaxis + "  The Y axis is :" + yaxis);

		driver.close();

	}

}
