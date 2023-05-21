package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetRectMethod {

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

		Rectangle value = text.getRect();

		int xaxis = value.getX();
		int yaxis = value.getY();
		System.out.println("The X axis is :" + xaxis + "  The Y axis is :" + yaxis);
		
		int h = value.getHeight();
		int w = value.getWidth();
		System.out.println("The Height is :" + h + "  The Width is :" + w);

		Point p = value.getPoint();
		Dimension d = value.getDimension();
		System.out.println("The Point is :" + p + "  The Dimension is :" + d);

		
		driver.close();

	}

}
