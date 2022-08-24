package excel_utility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility {

	public static String get_data(String path, int sheetNo, int row, int col) {
		
		String value = "";
		
		try {
		FileInputStream	fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(sheetNo);
		value = sheet.getRow(row).getCell(col).getStringCellValue();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return value;
	}
	
}
