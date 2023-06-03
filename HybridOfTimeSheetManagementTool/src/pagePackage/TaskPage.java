package pagePackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TaskPage {
	

	@FindBy(xpath = "//a[.='Open Tasks']") private WebElement OpenTaskModule;
	@FindBy(xpath = "//a[.='Completed Tasks']") private WebElement CompletedTaskModule;
	@FindBy(xpath = "//a[.='Projects & Customers']") private WebElement Projects_CustomersModule;
	@FindBy(xpath = "//a[.='Archives']") private WebElement ArchivesModule;
	@FindBy(xpath = "//input[@value='Create New Customer']")private WebElement CNcustomer;
	@FindBy(xpath = "//input[@value='Create New Project']")private WebElement CNproject;
	@FindBy(xpath = "//*[@name='name']")private WebElement customerNameTB;
	@FindBy(xpath = "//input[@type='submit']")private WebElement createCustomerButton; 
	@FindBy(xpath = "//input[@onclick='cancelCustomerCreation();']")private WebElement cancelCustomerButton;
	@FindBy(xpath = "//*[@name='customerId']")private WebElement dropDownElement;
	@FindBy(xpath = "//*[@name='name']")private WebElement projectNameTB;
	@FindBy(xpath = "//*[@name='createProjectSubmit']")private WebElement createProjectButton;
	@FindBy(xpath = "//input[@onclick='cancelProjectCreation();']")private WebElement cancelButton;
	
	@FindBy(xpath = "//input[@value='Create New Tasks']") private WebElement createnewtaskbtn;
	@FindBy(xpath = "(//select[@class='customer-project-select'])[1]") private WebElement customerdd;
	@FindBy(xpath = "(//select[@class='customer-project-select'])[2]") private WebElement projectdd;
	@FindBy(xpath = "//input[@name='task[0].name']") private WebElement taskTB;
	@FindBy(xpath = "//select[@name='task[0].billingType']") private WebElement billingdd;
	@FindBy(xpath = "//input[@name='task[0].markedToBeAddedToUserTasks']") private WebElement addttcheckbox;
	@FindBy(xpath = "//input[@value='Create Tasks']") private WebElement createtaskbtn;
	
	@FindBy(xpath = "//select[@name='usersSelector.selectedUser']") private WebElement ettdd;
	@FindBy(xpath = "//a[text()='Insert existing tasks']") private WebElement inserttlink;
//	@FindBy(xpath = "//td[@id='cpSelector.cpButton.contentsContainer']") private WebElement cpdd;
//	@FindBy(xpath = "//input[@id='cpSelector.cpPopup.cpListbox_item_0']") private WebElement custcheckbox;
//	@FindBy(xpath = "(//input[@type='checkbox'])[3]") private WebElement addTaskCheckbox;
//	@FindBy(xpath = "//input[@value='Insert Selected Tasks to the Enter Time-Track Page']") private WebElement insertTaskbtn;
//	
	@FindBy(xpath = "//input[@id='spent_14_4']") private WebElement Tb;
	@FindBy(xpath = "//input[@id='SubmitTTButton']") private WebElement savebtn;
	
	@FindBy(xpath = "//input[@type='checkbox']") private WebElement CompleteChechbox;
	@FindBy(xpath = "//input[@value='Complete Selected Tasks']") private WebElement Completeselectbtn;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]") private WebElement archivecheckbox;
	@FindBy(xpath = "//input[@value='Archive Selected']") private WebElement archivebtn;


	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getTb() {
		return Tb;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getEttdd() {
		return ettdd;
	}

	public WebElement getInserttlink() {
		return inserttlink;
	}

//	public WebElement getCpdd() {
//		return cpdd;
//	}
//
//	public WebElement getCustcheckbox() {
//		return custcheckbox;
//	}
//
//	public WebElement getAddTaskCheckbox() {
//		return addTaskCheckbox;
//	}
//
//	public WebElement getInsertTaskbtn() {
//		return insertTaskbtn;
//	}
	public WebElement getCreatenewtaskbtn() {
		return createnewtaskbtn;
	}


	public WebElement getCustomerdd() {
		return customerdd;
	}


	public WebElement getProjectdd() {
		return projectdd;
	}


	public WebElement getTaskTB() {
		return taskTB;
	}


	public WebElement getBillingdd() {
		return billingdd;
	}


	public WebElement getAddttcheckbox() {
		return addttcheckbox;
	}


	public WebElement getCreatetaskbtn() {
		return createtaskbtn;
	}


	public WebElement getOpenTaskModule() {
		return OpenTaskModule;
	}


	public WebElement getCompletedTaskModule() {
		return CompletedTaskModule;
	}


	public WebElement getProjects_CustomersModule() {
		return Projects_CustomersModule;
	}


	public WebElement getArchivesModule() {
		return ArchivesModule;
	}


	public WebElement getCNcustomer() {
		return CNcustomer;
	}


	public WebElement getCNproject() {
		return CNproject;
	}


	public WebElement getCustomerNameTB() {
		return customerNameTB;
	}


	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}


	public WebElement getCancelCustomerButton() {
		return cancelCustomerButton;
	}


	public WebElement getDropDownElement() {
		return dropDownElement;
	}


	public WebElement getProjectNameTB() {
		return projectNameTB;
	}


	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}


	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	
	// operational Methods
	
	public void createNewCustomerMethod(String custName) throws InterruptedException
	{
		Projects_CustomersModule.click();
		CNcustomer.click();
		customerNameTB.sendKeys(custName);
		Thread.sleep(2000);
		createCustomerButton.click();
	}
	
	
	public void createProjectMethod(String proName) throws InterruptedException, AWTException
	{
		CNproject.click();
		dropDownElement.click();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		projectNameTB.sendKeys(proName);
		Thread.sleep(2000);
		createProjectButton.click();
	}
	
	public void createtaskmgrMethod(String test) throws AWTException, InterruptedException {
		createnewtaskbtn.click();
		customerdd.click();
		Robot rb = new Robot();
		for(int i=0;i<3;i++) {	rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);}
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		projectdd.click();
		for(int i=0;i<4;i++) {	rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);}
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		taskTB.sendKeys(test);
		billingdd.click();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		addttcheckbox.click();
		Thread.sleep(2000);
		createtaskbtn.click();
		
		
		
	}
	
	public void assigntasktoTEMethod() throws AWTException, InterruptedException {
		ettdd.click();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		inserttlink.click();Thread.sleep(14000);
	}
	
	public void testenggperformtaskMethod() throws InterruptedException {
		Thread.sleep(5000);
		savebtn.click();
	}
	
	public void mgrcomlpeteTaskMethod() throws InterruptedException {
		CompleteChechbox.click();Thread.sleep(1000);
		Completeselectbtn.click();Thread.sleep(1000);
	}
	
	public void archiveMethod() throws InterruptedException, AWTException {
		archivecheckbox.click();Thread.sleep(1000);
		archivebtn.click();Thread.sleep(1000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
	}
	
	
	

}
