package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectByIndexValueMethod {
	public static void main(String[] args) throws InterruptedException {

		// To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// To Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		// To Maximize Chrome Browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// To Launch Web Application
		driver.get("file:///C:/Users/Tukaram%20K%20Kalkile/OneDrive/Desktop/wcsm8_work%20space/wcsm8seleniumproject/HTML/MULTISELECT-DROPDOWN.html");

		WebElement dropdown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropdown);

		
		for(int i=0;i<10;i++)
		{	if(i%2==0) 
			{
			Thread.sleep(2000);
			sel.selectByIndex(i);
			}
			else
			{
				System.out.println("It's ODD Value Place");
			}
		}
		for(int i=0;i<10;i++)
		{	if(i%2==0) 
			{
			Thread.sleep(2000);
			sel.deselectByIndex(i);
			}
			else
			{
				System.out.println("It's ODD Value Place");
			}
		}
		Thread.sleep(2000);
		driver.close();

	}

}
