package genericPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Worklib extends BaseTest {

	// To Handle PopUp Methods

	public void handlePopup()
	{
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();

	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();

	}


	public void dismissConfirmation()
	{
		driver.switchTo().alert().dismiss();
	}

	public void acceptConfirmation() {
		driver.switchTo().alert().accept();

	}

	// Handle Mouse Actions

	public void rightClick(WebElement target) {
		Actions act = new Actions(driver);
		act.contextClick(target).perform();

	}

	public void doubleClick(WebElement target) {
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();

	}

	public void mouseHover(WebElement target) {
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();

	}

	public void dragAndDrop(WebElement src,WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(src,target).perform();

	}

	//Handle Frame
	public void handleByFrameByindex(int index) {
		driver.switchTo().frame(index);
	}

	public void handleByFrameByNameOrId(String NameOrID) {
		driver.switchTo().frame(NameOrID);
	}

	public void handleByFrameByinex(WebElement Frame) {
		driver.switchTo().frame(Frame);
	}
	
	// handle DropDown Methods
	
		public void dropDownSelect(WebElement element, int index)
		{
		   Select sel = new Select(element);
		   sel.selectByIndex(index);
		}
	
	
}















