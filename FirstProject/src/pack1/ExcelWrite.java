package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite
{
	
	public static void main(String[] args) throws IOException
	{
		
		String path = "D:\\TRAININGS\\TRAININGS\\NEW BATCH\\Excel File.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook wb = new XSSFWorkbook(file); // loading/opening file
		XSSFSheet sheet = wb.getSheet("Sheet4");  // decide sheet 
		XSSFRow row = sheet.getRow(5);  // decide row
		XSSFCell cell = row.getCell(1);  // decide column
		
//		XSSFCell createdCell = sheet.createRow(5).createCell(1);
		
	
		FileOutputStream fOut = new FileOutputStream(path);
		cell.setCellValue(true);  // update value
		wb.write(fOut);  // save excel
		
		System.out.println("Operation Completed");
		
		
		
		
		
		
	}
	
	

}
