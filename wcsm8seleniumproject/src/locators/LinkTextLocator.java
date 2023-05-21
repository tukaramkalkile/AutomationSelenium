package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator {
		public static void main(String[] args) throws InterruptedException {
			// TO IllegalStateExecption
			//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

			//To Launch Firefox browser
			WebDriver driver = new FirefoxDriver();

			//To Maximize Firefox Browser
			driver.manage().window().maximize();

			//To Launch Web Application
			driver.get("file:///C:/Users/Tukaram%20K%20Kalkile/OneDrive/Desktop/wcsm8_work%20space/wcsm8seleniumproject/HTML/LINK.html");
			
			driver.findElement(By.linkText("MYNTRA LINK")).click();
			driver.close();
		}
		
}
