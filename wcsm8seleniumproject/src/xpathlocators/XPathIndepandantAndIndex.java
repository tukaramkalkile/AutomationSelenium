package xpathlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XPathIndepandantAndIndex {	public static void main(String[] args) throws InterruptedException {

	// IT IS USED TO LAUNCH WEB APPLICATION

	//To avoid IllegalStateExeception
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

	//To avoid ConnectionFailedExeception
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");

	//TO Launch the Chrome Browser
	WebDriver driver = new ChromeDriver(co);

	//To Maximize the Chrome Browser
	driver.manage().window().maximize();

	//To Stop execution for 2seconds
	Thread.sleep(1000);

	//To Launch Web Application
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hp Laptops",Keys.ENTER);
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(@class,'_24_Dny')]/following-sibling::div[text()='Core i7']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@class,'_213eRC _2ssEMF')]/descendant::div[text()='Brand']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@class,'_24_Dny')]/following-sibling::div[text()='HP']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@class,'_24_Dny')]/following-sibling::div[text()='4★ & above']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@class,'_213eRC _2ssEMF')]/descendant::div[text()='Operating System']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@class,'_24_Dny')]/following-sibling::div[text()='Windows 11']")).click();
	
		
	Thread.sleep(2000);
	String getnameoffirstsuggestion = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_4rR01T'])[1]")).getText();

	
	Thread.sleep(2000);
	String getpriceoffirstsuggestion = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
	System.out.println(getnameoffirstsuggestion+ getpriceoffirstsuggestion);


	
	Thread.sleep(2000);
	driver.quit();
	

}
}
