package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Sreenshotway1 {
public static void main(String[] args) throws IOException, InterruptedException {
	// To avoid IllegalStateExeeption
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	// To Launch Chrome Browser
	 ChromeDriver driver = new ChromeDriver();

	// To Maximize Chrome Browser
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	// To Launch Web Application
	driver.get("https://www.mercedes-benz.co.in/?group=all&subgroup=see-all&view=BODYTYPE");
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	//Implementation of method
	File src = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./ScreenShots/ss1.jpg");
	Files.copy(src, dest);
	Thread.sleep(2000);
	driver.close();
}

}
