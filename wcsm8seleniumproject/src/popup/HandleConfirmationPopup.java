package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleConfirmationPopup {
public static void main(String[] args) throws InterruptedException {
	// To avoid IllegalStateExeeption
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	// To Launch Chrome Browser
	ChromeDriver driver = new ChromeDriver();

	// To Maximize Chrome Browser
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	// To Launch Web Application
	driver.get("file:///C:/Users/Tukaram%20K%20Kalkile/OneDrive/Desktop/wcsm8_work%20space/wcsm8seleniumproject/HTML/Confirmation.html");
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Generate Pop-up
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//Handle Pop-up
	Thread.sleep(2000);
	Alert al = driver.switchTo().alert();
	System.out.println(al.getText());
	Thread.sleep(2000);
	al.accept();
	Thread.sleep(2000);
	
	driver.close();
	
	
}
}
