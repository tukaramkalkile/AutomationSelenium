package popup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleFileUploadPopUp {

	public static void main(String[] args) throws  IOException,InterruptedException {
		// To avoid IllegalStateExeeption
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// To Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		// To Maximize Chrome Browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// To Launch Web Application
		driver.get("http://127.0.0.1/login.do;jsessionid=a6fjgl6cp6203");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(1500);
		WebElement target = driver.findElement(By.xpath("//td[@class='navItem relative']/descendant::div[text()='Settings']"));
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
		
		WebElement target2 = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		Actions act1 = new Actions(driver);
		act1.doubleClick(target2).perform();
		Thread.sleep(3000);

		
		//To Handle FileUpload Pop-Up
		File file = new File("./Autoit/FileUpload.exe");
		String absolutepath = file.getAbsolutePath();
		Runtime.getRuntime().exec(absolutepath);
		
	
		Thread.sleep(5000);
		driver.quit();
	}

}
