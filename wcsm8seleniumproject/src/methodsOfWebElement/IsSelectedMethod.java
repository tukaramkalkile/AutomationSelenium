package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {

		// To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// To Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		// To Maximize Chrome Browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// To Launch Web Application
		driver.get("http://127.0.0.1/login.do;jsessionid=zf01jkw474nx");

		WebElement checkBox = driver.findElement(By.xpath("//input[@name='remember']"));

		boolean verify = checkBox.isSelected();

		System.out.println(verify);

		checkBox.click();

		boolean verify1 = checkBox.isSelected();

		System.out.println(verify1);
		
		driver.close();

	}
}