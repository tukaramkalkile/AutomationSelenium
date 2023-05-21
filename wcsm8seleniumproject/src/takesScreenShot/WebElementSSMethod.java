package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebElementSSMethod {

	public static void main(String[] args) throws IOException, InterruptedException {
		// To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// To Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// To Maximize Chrome Browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// To Launch Web Application
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement button = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		if (button.isEnabled()) {
			System.out.println("WE CAN DO LOGIN");
		}
		else {
			System.out.println("WE CANNOT DO LOGIN AND TAKE SCREENSHOT");
			File src = button.getScreenshotAs(OutputType.FILE);
			File dest = new File("./ScreenShots/weblementss.jpg");
			Files.copy(src, dest);
		}

		Thread.sleep(2000);
		driver.close();
	}

}
