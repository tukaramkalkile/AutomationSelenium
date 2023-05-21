package keywordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest{
public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH,"invalidcred");
		for(int i=1;i<rc;i++)
		{
		String invalidusername = flib.readExcelData(EXCEL_PATH,"invalidcred",i, 0);
	    String invalidpassword = flib.readExcelData(EXCEL_PATH,"invalidcred",i, 1);
	    
	    driver.findElement(By.name("username")).sendKeys(invalidusername);
	    driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
	    driver.findElement(By.id("loginButton")).click();
        Thread.sleep(2000);
	    driver.findElement(By.name("username")).clear();
	    
		}
		
		bt.closebrowser();
	}

}
