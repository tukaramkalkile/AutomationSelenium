package keywordDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IAutoConstant{
	
	static WebDriver driver;
	
	
	public void openbrowser() throws IOException {
		
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
	
	public void closebrowser() {
		driver.quit();
	}

}
