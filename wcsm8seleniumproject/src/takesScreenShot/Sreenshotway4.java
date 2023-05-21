package takesScreenShot;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Sreenshotway4 {
	public static void main(String[] args) throws IOException, InterruptedException {
		// To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// To Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		// To Maximize Chrome Browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// To Launch Web Application
		driver.get("https://www.lexusindia.co.in/en.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);

	//	EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		//Implementation of method
		//File src = efw.getScreenshotAs(OutputType.FILE);
	//	File dest = new File("./ScreenShots/ss4.jpg");
	//	Files.copy(src, dest);
		Thread.sleep(2000);
		driver.close();
	}

}
