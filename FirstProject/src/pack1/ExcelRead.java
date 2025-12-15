package pack1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead
{
	
	public static void main(String[] args) throws IOException
	{
		String path = "D:\\TRAININGS\\TRAININGS\\NEW BATCH\\Excel File.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file); // loading/opening file
		XSSFSheet sheet = wb.getSheet("Sheet4");  // decide sheet 
		XSSFRow row = sheet.getRow(2);  // decide row
		XSSFCell cell = row.getCell(0);  // decide column
		String data = cell.getStringCellValue(); // fetch String data from cell 
		System.out.println("data : "+ data);
		
		XSSFRow numRow = sheet.getRow(1);  // decide row
		XSSFCell numCell = numRow.getCell(1);  // decide column
		double data2 = numCell.getNumericCellValue(); // fetch numeric data from cell 
		
		System.out.println("data2 : "+ data2);
		
//		Method Chaining : 
//		String data4 = wb.getSheet("Sheet4").getRow(2).getCell(0).getStringCellValue();
		
	}
	
	

}
