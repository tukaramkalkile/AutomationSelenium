package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlePrintPopUpEdgeMethod {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// To avoid IllegalStateExeeption
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");

		// To Launch Edge Browser
		WebDriver driver = new EdgeDriver();

		// To Maximize Edge Browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// To Launch Web Application
		driver.get("https://www.selenium.dev/");

		//Generate a print pop-up by using ctrl-p
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);
		Thread.sleep(2000);

		for(int i=0;i<9;i++) {
			Thread.sleep(700);
			robot.keyPress(KeyEvent.VK_TAB);

		}

		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);


		Thread.sleep(1000);
		driver.close();	


	}

}
