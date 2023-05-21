package pompackage;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setup();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		
		Flib fb = new Flib();
		
		lp.validLogin(fb.readPropretyData(PROP_PATH, "username"), fb.readPropretyData(PROP_PATH, "password"));
		
		Thread.sleep(1200);
		hp.logoutMethod();
		Thread.sleep(1200);

		bt.teardown();
		
		
	}

}
