package week3.Day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static Object[][] ReadExcelData(String excelFileName) throws IOException {
		
		//Open the Excel WorkBook
		XSSFWorkbook ExcelworkBook = new XSSFWorkbook("./Data/"+excelFileName+".xlsx");
		
		//Navigate to the Sheet 
		XSSFSheet sheetAt = ExcelworkBook.getSheetAt(0);
		
		//Get the Number of Rows in the Sheet
		int NumOfRows = sheetAt.getLastRowNum();
		
		//Get the Number of Columns
		
		int NumOfColumns = sheetAt.getRow(0).getLastCellNum();
		
		//Storing in the 2 dimensional Array
		Object[][] data = new Object[NumOfRows][NumOfColumns];
		
		
		//Iterate to Print Values in the sheet
		for(int rowindex = 1;rowindex<=NumOfRows;rowindex++) {
			XSSFRow row = sheetAt.getRow(rowindex);
			for(int colindex=0;colindex<NumOfColumns;colindex++) {
				data[rowindex-1][colindex] = row.getCell(colindex).getStringCellValue();
				//System.out.println(data[rowindex-1][colindex]);
			}
		}
		
		ExcelworkBook.close();
		return data;		

	}

}
