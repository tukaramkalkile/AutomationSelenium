package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Sreenshotway2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		// To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// To Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		// To Maximize Chrome Browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// To Launch Web Application
		driver.get("https://www.koenigsegg.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		RemoteWebDriver rwd =(RemoteWebDriver)driver;
		//Implementation of method
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ss2.jpg");
		Files.copy(src, dest);
		Thread.sleep(2000);
		driver.close();
	}

}
