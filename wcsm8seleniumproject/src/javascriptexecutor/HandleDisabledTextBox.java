package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledTextBox {

	public static void main(String[] args) throws InterruptedException {
		// To avoid IllegalStateExeeption
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

				// To Launch Chrome Browser
				ChromeDriver driver = new ChromeDriver();

				// To Maximize Chrome Browser
				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// To Launch Web Application
				driver.get("file:///C:/Users/Tukaram%20K%20Kalkile/OneDrive/Desktop/wcsm8_work%20space/wcsm8seleniumproject/HTML/Textbox-disabled.html");
				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				driver.findElement(By.xpath("//input[@type='text']"));
				Thread.sleep(2000);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("document.getElementById('i5').value='Tukaram Kalkile'");
				Thread.sleep(2000);
				driver.close();
				}

}
