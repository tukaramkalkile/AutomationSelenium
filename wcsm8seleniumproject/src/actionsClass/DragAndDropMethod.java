package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {
	public static void main(String[] args) throws InterruptedException {
		        // To avoid IllegalStateExeeption
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

				// To Launch Chrome Browser
				WebDriver driver = new ChromeDriver();

				// To Maximize Chrome Browser
				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// To Launch Web Application
				driver.get("https://demo.guru99.com/test/drag_drop.html");
				
				WebElement src1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
				WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
				WebElement src3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
				WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
				//--------------------------------------------------------------------------
				
				WebElement target1 = driver.findElement(By.xpath("//div[@id='shoppingCart1']/descendant::li[@class='placeholder']"));
				
					//To perform Drag and Drop for Debit Account
					Actions act = new Actions(driver);
					Thread.sleep(2000);
					act.dragAndDrop(src1, target1).perform();
				
				WebElement target2 = driver.findElement(By.xpath("//div[@id='shoppingCart4']/descendant::li[@class='placeholder']"));
	
					//To perform Drag and Drop for Debit Amount
					Thread.sleep(2000);
					act.dragAndDrop(src2, target2).perform();
				
				WebElement target3 = driver.findElement(By.xpath("//div[@id='shoppingCart3']/descendant::li[@class='placeholder']"));
		
					//To perform Drag and Drop for Credit Account
					Thread.sleep(2000);
					act.dragAndDrop(src3, target3).perform();
				
				WebElement target4 = driver.findElement(By.xpath("//div[@id='shoppingCart4']/descendant::ol[@id='amt8']"));

					//To perform Drag and Drop for Credit Amount
					Thread.sleep(2000);
					act.dragAndDrop(src4, target4).perform();
					
				Thread.sleep(2000);
				driver.close();
				
		
	}

}
