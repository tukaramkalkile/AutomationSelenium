package methodsOfWebElement;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {
	public static void main(String[] args) {
		
	
	// To avoid IllegalStateExeeption
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	// To Launch Chrome Browser
	WebDriver driver = new ChromeDriver();

	// To Maximize Chrome Browser
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	// To Launch Web Application
	driver.get("https://www.selenium.dev/");
	
	WebElement element = driver.findElement(By.xpath("//h2[.='News']"));
	
	String tagName = element.getTagName();
	
	System.out.println(tagName);
	
	driver.close();
	
	



}
}

