package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {
	public static void main(String[] args) throws InterruptedException {
		// To avoid IllegalStateExeeption
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

				// To Launch Chrome Browser
				WebDriver driver = new ChromeDriver();

				// To Maximize Chrome Browser
				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// To Launch Web Application
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
				
				driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
				driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button')]")).click();
				
				WebElement dropdown = driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent']"));
				Select sel = new Select(dropdown);
				Thread.sleep(2000);
				sel.selectByIndex(2);
				Thread.sleep(2000);
				driver.close();

				
				
	}

}
