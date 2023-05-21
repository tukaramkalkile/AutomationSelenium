package automationtasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndiaLoginPage {

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
		driver.get("https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/oauth2/v2.0/authorize?client_id=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc&redirect_uri=https://api-loyalty.airindia.in/v1/security/authorization/openidconnect/authorize/delegated-token&response_type=code&state=eFNEUlZlQ0xGRWxuXzNuS3dxb1lqUFdQR2FHSHdNUTItWXhFYjNiamFkUFRB_en-GB_false_&nonce=eFNEUlZlQ0xGRWxuXzNuS3dxb1lqUFdQR2FHSHdNUTItWXhFYjNiamFkUFRB&scope=openid%20offline_access%20profile%20phone%20email&p=B2C_1A_SIGNUP_SIGNIN&prompt=login&display=page&code_challenge_method=S256&code_challenge=coq_9TmtFgDO91TCiEBcEajLjy79xBF_EfWmAMTlEfo&ui_locales=en-GB");
		Thread.sleep(2000);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("manishmourya0000@gmail.com",Keys.ENTER);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Manish$12345",Keys.ENTER);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='next']")).click();

		Thread.sleep(6000);
		driver.close();
	}

}
