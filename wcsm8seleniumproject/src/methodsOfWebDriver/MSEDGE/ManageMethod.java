package methodsOfWebDriver.MSEDGE;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ManageMethod {

	// IT IS USED TO MANAGE BROWSER

	public static void main(String[] args) throws InterruptedException {

		//To avoid IllegalStateExeeption
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");


		//To Launch Edge Browser
		WebDriver driver = new EdgeDriver();

		//To Maximize Edge Browser
		driver.manage().window().maximize();

		//To Set Size of Edge Browser
		Dimension targetsize = new Dimension(500,500);
		Thread.sleep(5000);
		driver.manage().window().setSize(targetsize);

		//To Set Position of Edge Browser
		Point targetposition = new Point(550,200);
		Thread.sleep(5000);
		driver.manage().window().setPosition(targetposition);

		//To Stop Execution for seconds
		Thread.sleep(2000);

		//To close Web Browser
		driver.close();

	}

}
