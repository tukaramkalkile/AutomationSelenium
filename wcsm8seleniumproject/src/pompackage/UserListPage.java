package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	
	@FindBy(xpath = "//input[@value='Create New User']") private WebElement createnewuserbutton;
	@FindBy(xpath = "//*[@name='username']") private WebElement usernameTB;
	@FindBy(xpath = "//*[@name='passwordText']") private WebElement passwordTB;
	@FindBy(xpath = "//*[@name='passwordTextRetype']") private WebElement passwordTextRetypeTB;
	@FindBy(xpath = "//*[@name='firstName']") private WebElement firstNameTB;
	@FindBy(xpath = "//*[@name='lastName']") private WebElement lastNameTB;
	@FindBy(xpath = "//input[@type='submit']") private WebElement creatuserbutton;
	@FindBy(xpath = "//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]") private WebElement cancelbutton;
	@FindBy(xpath = "(//a[contains(text(),'System,')]/ancestor::tbody/descendant::a)[1]") private WebElement userCreatedlink;
	@FindBy(xpath = "//input[@value='Delete This User']") private WebElement deleteuserbutton;
	
	
	
	//initialization
	public UserListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getCreatenewuserbutton() {
		return createnewuserbutton;
	}
	public WebElement getUsernameTB() {
		return usernameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getPasswordTextRetypeTB() {
		return passwordTextRetypeTB;
	}
	public WebElement getFirstNameTB() {
		return firstNameTB;
	}
	public WebElement getLastNameTB() {
		return lastNameTB;
	}
	public WebElement getCreatuserbutton() {
		return creatuserbutton;
	}
	public WebElement getCancelbutton() {
		return cancelbutton;
	}
	public WebElement getUserCreatedlink() {
		return userCreatedlink;
	}
	public WebElement getDeleteuserbutton() {
		return deleteuserbutton;
	}
	
	//operational
	public void createusermethod(String usn,String pass,String fn,String ln) throws InterruptedException
	{
		
		createnewuserbutton.click();
		Thread.sleep(1500);
		usernameTB.sendKeys(usn);
		Thread.sleep(1500);
		passwordTB.sendKeys(pass);
		Thread.sleep(1500);
		passwordTextRetypeTB.sendKeys(pass);
		Thread.sleep(1500);
		firstNameTB.sendKeys(fn);
		Thread.sleep(1500);
		lastNameTB.sendKeys(ln);
		Thread.sleep(1500);
		creatuserbutton.click();
		
	}
	
	public void deleteusermethod() throws InterruptedException
	{			
		Thread.sleep(1500);
		userCreatedlink.click();
		deleteuserbutton.click();
		Worklib wl = new Worklib();
		Thread.sleep(1500);
		wl.handlePopup();
	}

}
