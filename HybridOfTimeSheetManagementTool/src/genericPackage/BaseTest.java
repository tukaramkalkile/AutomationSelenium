package genericPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest  extends Flib implements IAutoConstant{
	
  protected  static WebDriver driver;
	
	@BeforeMethod
	public void setup() throws IOException {
		
		Flib flib = new Flib();
		String browserValue = flib.readPropData(PROP_PATH, "browser");
		String url = flib.readPropData(PROP_PATH, "url");
		
		if(browserValue.equals("chrome")) {
		System.setProperty(CHROME_KEY,CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		}
		else if(browserValue.equals("firefox")) {
				System.setProperty(FIREFOX_KEY,FIREFOX_PATH);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);
				}
		else if(browserValue.equals("edge")) {
				System.setProperty(EDGE_KEY,EDGE_PATH);
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);
				}
		else {
			System.out.println("Invalid BrowserValue!!!!");
		}
		
	}
	
	public void failedMethodToTakeScreenshot(String failedMethod) {
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(SCREEN_SHOT+failedMethod+"./ss1.png");
		Files.copy(src, dest);
		} catch (IOException e) {
			
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
