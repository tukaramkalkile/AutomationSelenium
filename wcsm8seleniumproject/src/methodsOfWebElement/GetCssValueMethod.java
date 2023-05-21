package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCssValueMethod {

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

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// To Launch Web Application
		driver.get("https://www.selenium.dev/");

		WebElement text = driver.findElement(By.xpath("//a[text()='Watch the Videos']"));
		
		String value = text.getCssValue("font-family");
		System.out.println(value);
		
		driver.close();

	}

}
