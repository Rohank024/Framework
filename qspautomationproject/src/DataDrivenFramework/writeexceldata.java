package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeexceldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
	FileInputStream fis = new FileInputStream("./data/ActiTimevalidcreds.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("validcreds");
	Row row = sh.getRow(0);	
	Cell cell = row.createCell(2);
	cell.setCellValue("status");
	
	 FileOutputStream fos = new FileOutputStream("./data/ActiTimevalidcreds.xlsx");
	wb.write(fos);
	
	}

}
