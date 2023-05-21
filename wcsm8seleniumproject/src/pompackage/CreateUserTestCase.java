package pompackage;

import java.io.IOException;

public class CreateUserTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setup();
		
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(1200);
		lp.validLogin(flib.readPropretyData(PROP_PATH, "username"), flib.readPropretyData(PROP_PATH, "password"));
		
		Thread.sleep(1200);
		
		HomePage hp = new HomePage(driver);	
		Thread.sleep(1200);
		hp.usermodulemethod();
		Thread.sleep(2000);
		
		UserListPage ulp = new UserListPage(driver);
		
//		String usn = flib.readDataFromExcelSheet(EXCEL_PATH, "users", 1, 0);
//		String pass = flib.readDataFromExcelSheet(EXCEL_PATH, "users", 1, 1);
//		String fn = flib.readDataFromExcelSheet(EXCEL_PATH, "users", 1, 2);
//		String ln = flib.readDataFromExcelSheet(EXCEL_PATH, "users", 1, 3);
//		
		Thread.sleep(2000);
		ulp.createusermethod(flib.readDataFromExcelSheet(EXCEL_PATH, "users", 1, 0), flib.readDataFromExcelSheet(EXCEL_PATH, "users", 1, 1), flib.readDataFromExcelSheet(EXCEL_PATH, "users", 1, 2), flib.readDataFromExcelSheet(EXCEL_PATH, "users", 1, 3));
		Thread.sleep(1200);
		ulp.deleteusermethod();
		Thread.sleep(1200);
		hp.logoutMethod();
		
		bt.teardown();
	
		}
}
