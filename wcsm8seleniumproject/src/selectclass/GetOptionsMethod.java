package selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {
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
		List<WebElement> alloptions = sel.getOptions();
		System.out.println("For Loop Working");

		for(int i=0;i<alloptions.size();i++)
		{			Thread.sleep(1500);	

		String options = alloptions.get(i).getText();
		System.out.println(options);

		}
		System.out.println("ForEach Loop Working");

		for(WebElement op:alloptions)
			{			Thread.sleep(1500);	

		String options =op.getText();
		System.out.println(options);

		}
		Thread.sleep(1500);	
		driver.close();

		}

	}
