package excel_utility;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility {

	public static String get_data(String path, int sheetNo, int row, int col) {
		
		String value = "";
		
		try {
		FileInputStream	fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(sheetNo);
		
		if(sheet.getRow(row).getCell(col).getCellType() == CellType.STRING) {
			value = sheet.getRow(row).getCell(col).getStringCellValue();
		}
		
		else if(sheet.getRow(row).getCell(col).getCellType() == CellType.NUMERIC) {
			double number = sheet.getRow(row).getCell(col).getNumericCellValue();
			value = NumberToTextConverter.toText(number);
		}

		else if(sheet.getRow(row).getCell(col).getCellType() == CellType.FORMULA) {
			double number = sheet.getRow(row).getCell(col).getNumericCellValue();
			value = NumberToTextConverter.toText(number);
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return value;
	}
	
}
