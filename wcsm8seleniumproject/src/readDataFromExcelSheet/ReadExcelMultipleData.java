package readDataFromExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Read Data From IPL ExcelSheet

		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide the path of Excel sheet
		Workbook wb = WorkbookFactory.create(fis);//make the file ready to ready
		Sheet sheet = wb.getSheet("IPL");//get into desired sheet

		for (int i = 0; i < 10; i++) {
			Row row = sheet.getRow(i);//get into desired row
			for (int j = 0; j <2; j++) {
				Cell cell = row.getCell(j);//get into desired cell
				String data = cell.getStringCellValue();//Read the value from cell

				if (j%2!=0) {
					System.out.print( " = ");
				}					
				System.out.print(data + " ");//
			}System.out.println();

		}

	}
}
