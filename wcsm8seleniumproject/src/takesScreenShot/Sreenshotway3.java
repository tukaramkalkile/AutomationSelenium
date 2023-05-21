package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Sreenshotway3 {
public static void main(String[] args) throws IOException, InterruptedException {
	// To avoid IllegalStateExeeption
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	// To Launch Chrome Browser
	RemoteWebDriver driver = new ChromeDriver();

	// To Maximize Chrome Browser
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	// To Launch Web Application
	driver.get("https://wmotors.ae/lykan-hypersport.html");
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	//Implementation of method
	File src = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./ScreenShots/ss3.jpg");
	Files.copy(src, dest);
	Thread.sleep(2000);
	driver.close();
}
}
