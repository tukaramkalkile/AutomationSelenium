package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
	// Store all the WebElment of login page.
	
	
	//declare by FindBy Annotation.
	
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name = "pwd") private WebElement passwordTB;
	@FindBy(id = "loginbutton") private WebElement loginButton;
	@FindBy(id = "keepLoggedInCheckBox") private WebElement keepLoggedInCheckBox;
	@FindBy(linkText = "Actimind Inc.") private WebElement actiMindlink;
	
	
	//initialization
	

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public WebElement getUsernameTB() {
		return usernameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}
	public WebElement getActiMindlink() {
		return actiMindlink;
	}

	
	//operational Methods
	public void validLogin(String validusername,String validpassword)
	{
		usernameTB.sendKeys(validusername);
		passwordTB.sendKeys(validpassword);
		loginButton.click();
	}
	
	public void invalidLogin(String invalidusername,String invalidpassword) throws InterruptedException
	{
		usernameTB.sendKeys(invalidusername);
		passwordTB.sendKeys(invalidpassword);
		loginButton.click();
		Thread.sleep(1000);
		usernameTB.clear();
	}
	
	

}
