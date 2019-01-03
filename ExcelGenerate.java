package AutoHeal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelGenerate {
	public static void excelWrite(ArrayList<String> xpathList){
		try {
			String excelName = "D:\\xpathGenerator.xlsx";
			String sheetName = "test";
			FileInputStream inputStream = new FileInputStream(excelName);
			XSSFWorkbook wb = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = wb.getSheetAt(0);
			
			
			for(int i=1; i<=xpathList.size(); i++) {
				XSSFRow row = sheet.createRow(i);
				XSSFCell cell = row.createCell(3);
				cell.setCellValue(xpathList.get(i));
//				inputStream.close();
				FileOutputStream fileOut = new FileOutputStream(excelName);

				//write this workbook to an Outputstream.
				wb.write(fileOut);
				fileOut.close();
			}
			
			
			
			
//			Workbook workBook = WorkbookFactory.create(inputStream);
//			Sheet sheet = workBook.getSheetAt(0);
//			Row row = sheet.createRow(0);
//			Cell cell = row.createCell(0);
//			cell.setCellValue("test");
//			

//			fileOut.flush();
			
			
			
			
		}catch(Exception e) {
			e.getMessage();
		}
	}
    
}
