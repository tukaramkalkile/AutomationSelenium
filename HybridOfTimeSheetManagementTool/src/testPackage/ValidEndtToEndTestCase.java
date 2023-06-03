package testPackage;

import java.awt.AWTException; 
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TaskPage;
import pagePackage.UserPage;
public class ValidEndtToEndTestCase extends BaseTest {
	
	@Test
	public void endtoendmethod() throws IOException, EncryptedDocumentException, InterruptedException, AWTException  {
		
		{
			BaseTest bt = new BaseTest();
			bt.setup();
			Flib flib = new Flib();
			LoginPage lp = new LoginPage(driver);
			
			//ADMIN TASK
			lp.validLogin(flib.readPropData(PROP_PATH,"username"),flib.readPropData(PROP_PATH,"password"));
	        Thread.sleep(2000);		
	        HomePage hp = new HomePage(driver);
	        Thread.sleep(2000);
	        //Customer Create
			hp.taskModuleMethod();
			TaskPage task = new TaskPage(driver);
			task.createNewCustomerMethod(flib.readExcelData(EXCEL_PATH,"Projectcustomer",1,0));
			Thread.sleep(2000);
	        //Project Create
			task.createProjectMethod(flib.readExcelData(EXCEL_PATH,"Projectcustomer",1,1));
		    Thread.sleep(2000);
		    //Manager Create
			hp.usersModuleMethod();
			UserPage ulp = new UserPage(driver);	       
	        ulp.createMgrUserMethod(flib.readExcelData(EXCEL_PATH,"Manager",1,0), flib.readExcelData(EXCEL_PATH,"Manager",1,1),flib.readExcelData(EXCEL_PATH,"Manager",1,2),flib.readExcelData(EXCEL_PATH,"Manager",1,3));
			lp.logoutMethod();
						
			//MANAGER TASK
			lp.validLogin(flib.readExcelData(EXCEL_PATH, "Manager", 1,0),flib.readExcelData(EXCEL_PATH, "Manager", 1,1));
			hp.taskModuleMethod();
			task.createtaskmgrMethod(flib.readExcelData(EXCEL_PATH, "Projectcustomer", 1, 2));
			//TestEngg Create
			hp.usersModuleMethod();
			ulp.createTestEnggUserMethod(flib.readExcelData(EXCEL_PATH,"TestEngg",1,0), flib.readExcelData(EXCEL_PATH,"TestEngg",1,1), flib.readExcelData(EXCEL_PATH,"TestEngg",1,2), flib.readExcelData(EXCEL_PATH,"TestEngg",1,3));
//			//Assign Task
//			hp.timeTrackModuleMethod();
//			task.assigntasktoTEMethod();
//			hp.logOutMethod();
//			
//			//TESTENGG TASK
//			lp.validLogin(flib.readExcelData(EXCEL_PATH, "TestEngg", 1,0),flib.readExcelData(EXCEL_PATH, "TestEngg", 1,1));
//			task.testenggperformtaskMethod();
			hp.logOutMethod();
					
			//MANAGER TASK
			//Manager Complete task
			lp.validLogin(flib.readExcelData(EXCEL_PATH, "Manager", 1,0),flib.readExcelData(EXCEL_PATH, "Manager", 1,1));
			hp.taskModuleMethod();
			task.mgrcomlpeteTaskMethod();
			//Manager Archive the project
			hp.pcsubmodule();
			task.archiveMethod();
			hp.logOutMethod();
			Thread.sleep(5000);
			
			lp.validLogin(flib.readPropData(PROP_PATH,"username"),flib.readPropData(PROP_PATH,"password"));
			lp.logoutMethod();	}}}
