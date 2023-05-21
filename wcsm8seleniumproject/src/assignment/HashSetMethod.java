package assignment;

import java.time.Duration; 
import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashSetMethod {

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
		Thread.sleep(2000);	
		List<WebElement> alloption = sel.getOptions();
		HashSet<String> h = new HashSet<String>();

		for(int i=0;i<alloption.size();i++)
		{
			Thread.sleep(200);	

			String option = alloption.get(i).getText();
			h.add(option);


		}
		for(String value:h) {		
			Thread.sleep(2000);	

			System.out.println(value);
		}
		driver.close();

	}

}
