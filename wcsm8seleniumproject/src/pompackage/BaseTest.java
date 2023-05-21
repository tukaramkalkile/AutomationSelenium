package pompackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends Flib implements IAutoConstant {
	
	static WebDriver driver;
	
	public void setup() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropretyData(PROP_PATH, "browser");
		String url = flib.readPropretyData(PROP_PATH, "url");
		
		if(browserValue.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);			
		}
		else if(browserValue.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			
		}
		else if(browserValue.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			
		}
		else {
			System.out.println("Invalid Browservalue");
		}
	}
	public void teardown()
	{
		driver.quit();
	}
}
