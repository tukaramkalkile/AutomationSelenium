package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//a[.='Logout']") private WebElement logoutlink;
	@FindBy(xpath = "//A[@class='content users']/IMG[@class='sizer']") private WebElement usersModule;
	@FindBy(xpath = "//A[@class='content tasks']/IMG[@class='sizer']") private WebElement tasksModule;
	@FindBy(xpath = "//A[@class='content tt_selected selected']/DIV[2]/IMG") private WebElement timetrackModule;
	@FindBy(xpath = "//A[@class='content reports']/IMG[@class='sizer']") private WebElement reportsModule;
	@FindBy(xpath = "//A[@class='content calendar']/IMG[@class='sizer']") private WebElement workscheduleModule;
	@FindBy(xpath = "//A[@class='content administration']/IMG[@class='sizer']") private WebElement settingsModule;
	// initialization
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//operational
	public void usermodulemethod()
	{
		usersModule.click();
	}
	public void logoutMethod()
	{
		logoutlink.click();
		
	}

	//initialization
	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getUsersModule() {
		return usersModule;
	}

	public WebElement getTasksModule() {
		return tasksModule;
	}

	public WebElement getTimetrackModule() {
		return timetrackModule;
	}

	public WebElement getReportsModule() {
		return reportsModule;
	}
	public WebElement getWorkscheduleModule() {
		return workscheduleModule;
	}

	public WebElement getSettingsModule() {
		return settingsModule;
	}
	
	
}
