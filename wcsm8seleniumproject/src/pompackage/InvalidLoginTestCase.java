package pompackage;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.setup();

		Flib fb = new Flib();
		LoginPage lp = new LoginPage(driver);

		int rc = fb.rowCount(EXCEL_PATH, "invalidcred");
		for (int i = 0; i <= rc; i++) {
			String invalidUsername = fb.readDataFromExcelSheet(EXCEL_PATH, "invalidcred", i, 0);
			String invalidPassword = fb.readDataFromExcelSheet(EXCEL_PATH, "invalidcred", i, 1);
			lp.invalidLogin(invalidUsername, invalidPassword);

		}
		bt.teardown();
	

	}

}
