package xpathlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathContainsAndAxes {
	public static void main(String[] args) throws InterruptedException {

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
		Thread.sleep(2000);

		//To Launch Web Application
		driver.get("https://www.airindia.in/");
		Thread.sleep(2000);
		co.addArguments("--disabled-notification=*");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Pune, Lohegaon Airport, PNQ, India, IN')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Delhi");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Delhi, Indira Gandhi International Airport, DEL, India, IN')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'_depdateeu1')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(@class,' ui-datepicker-week-end ')]/descendant::a[contains(text(),'15')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'_retdateeu1')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(@class,' ui-datepicker-week-end ')]/descendant::a[contains(text(),'30')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='ddladult1']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[contains(@name,'ddladult1')]/descendant::option[text()='2']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='ddlchildren1']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[contains(@name,'ddlchildren1')]/descendant::option[text()='1']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='ddlinfants1']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[contains(@name,'ddlinfants1')]/descendant::option[text()='1']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='concessionaryType1']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[contains(@name,'concessionaryType1')]/descendant::option[contains(text(),'Student')]")).click();


		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='_classType1']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("	//select[contains(@name,'_classType1')]/descendant::option[contains(text(),'Premium Economy')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnbooking']")).click();

		driver.close();


	}

}
