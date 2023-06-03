package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
	@FindBy(xpath = "//A[@class='content users']/IMG[@class='sizer']") private WebElement usersModule;
	@FindBy(xpath = "//A[@class='content tasks']/IMG[@class='sizer']")private WebElement taskModule;
	@FindBy(xpath = "(//table[@class='navTable']/descendant::div[text()='Time-Track']/following::img)[1]")private WebElement timeTrackModule; 
	@FindBy(xpath ="//A[@class='content reports']/IMG[@class='sizer']" )private WebElement reportModule;
	@FindBy(xpath = "//div[text()='Work Schedule']/following-sibling::img") private WebElement workScheduleModule;
	@FindBy(xpath = "//a[text()='Projects & Customers']") private WebElement pcsubmodule;
	


	// intialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	//utilization
	public WebElement getPcsubmodule() {
		return pcsubmodule;
	}
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public WebElement getUsersModule() {
		return usersModule;
	}
	public WebElement getTaskModule() {
		return taskModule;
	}
	public WebElement getTimeTrackModule() {
		return timeTrackModule;
	}
	public WebElement getReportModule() {
		return reportModule;
	} 
	
	public WebElement getWorkScheduleModule() {
		return workScheduleModule;
	}

	
	
	
	// operational Methods


	public void logOutMethod()
	{
		logoutLink.click();
	}
	
	public void usersModuleMethod()
	{
		usersModule.click();
	}
	
	public void taskModuleMethod()
	{
		taskModule.click();
	}
	
	public void timeTrackModuleMethod()
	{
		timeTrackModule.click();
	}
	public void pcsubmodule()
	{
		pcsubmodule.click();
	}

}
