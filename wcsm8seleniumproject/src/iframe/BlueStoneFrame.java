package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneFrame {

	public static void main(String[] args) throws InterruptedException {
		// To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// To Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// To Maximize Chrome Browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// To Launch Web Application
		driver.get("https://www.bluestone.com/jewellery/watch+band.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='fc_widget']"));
		Thread.sleep(2000);
		//Switch the Control from frame to chatbox
		driver.switchTo().frame("fc_widget");// By Using Name or Id
		//driver.switchTo().frame(frameElement);// By Using WebElement
		
		WebElement chatbox = driver.findElement(By.id("chat-icon"));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(chatbox)).click();
		//Switch the controls to default Webpage
		driver.switchTo().parentFrame();
		//Insert the input for textbox
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("Tukaram");

		driver.findElement(By.id("chat-fc-email")).sendKeys("kalkile@gmail.com");

		driver.findElement(By.id("chat-fc-phone")).sendKeys("9921145785");
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
