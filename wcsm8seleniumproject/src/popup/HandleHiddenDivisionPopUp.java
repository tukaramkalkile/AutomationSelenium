package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		//Implicit  Wait Method
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				
				//Applying the implicitly Wait to appear The Webelement
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='✕']")).click();
				Thread.sleep(2000);
				driver.quit();
	}

}
