package readDataFromExcelSheet;

import java.io.FileInputStream; 
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelDataGeneralization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis1 = new FileInputStream("./data/TestData.xlsx");//provide the path of Excel sheet
		Workbook wb1 = WorkbookFactory.create(fis1);//make the file ready to ready
		Sheet sheet1 = wb1.getSheet("IPL");//get into desired sheet
		int rc = sheet1.getLastRowNum();//get into desired row
		
		
		for (int i = 0; i <= rc; i++) {		
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide the path of Excel sheet
		Workbook wb = WorkbookFactory.create(fis);//make the file ready to ready
		Sheet sheet = wb.getSheet("IPL");//get into desired sheet
		Row row = sheet.getRow(i);//get into desired row
		Cell cell = row.getCell(0);//get into desired cell
		String data = cell.getStringCellValue();//Read the value from cell
		Thread.sleep(1200);
		System.out.println(data );//
		}
	}

}
