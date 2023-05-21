package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.className("lNPNe")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().refresh();
	driver.switchTo().activeElement().sendKeys("phoebe buffay",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.className("lNPNe")).click();
	Thread.sleep(4000);
	driver.close();
	

	}

}
