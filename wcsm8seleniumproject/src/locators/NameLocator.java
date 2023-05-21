package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.navigate().to("http://127.0.0.1/login.do;jsessionid=59s4a8prd44fg");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("logout")).click();
	Thread.sleep(4000);
	driver.close();

	}

}
