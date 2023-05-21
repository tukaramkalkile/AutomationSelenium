package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class FindElementsMethod {

	public static void main(String[] args)  {// IT IS USED TO LAUNCH WEB APPLICATION

		//To avoid IllegalStateExeception
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");

		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--remote-allow-origins=*");

		//TO Launch the MSEdge Browser
		WebDriver driver = new EdgeDriver(eo);

		//To Maximize MSEdge Browser
		driver.manage().window().maximize();

		//To stop Execution for 3seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//To Launch Web Application
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles",Keys.ENTER);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_4rR01T']"));
		List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));

		for(int i=0;i<options.size();i++) 
		{			String name = options.get(i).getText();
			for(int j=i;j<=i;j++) 
			{	String price = alloptions.get(j).getText();
				System.out.println(i+"  "+name+" AND "+price );
            }
		}driver.close();
	}
}
