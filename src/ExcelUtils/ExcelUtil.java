package ExcelUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.TestBase;

public class ExcelUtil extends TestBase{
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static File f1;
	public static FileInputStream fis1;
	
	public static void main(String[] args) throws Exception {
		String[] str1 = new String[2];
		ExcelUtil obj1 = new ExcelUtil();
		str1 = obj1.excelData(str1);
		System.out.println(str1[0]);
		System.out.println(str1[1]);
	}
	
	public ExcelUtil() throws Exception {
		String ExcelPath = prop.getProperty("ExcelDataPath");
		File f1 = new File(ExcelPath);
		fis1 = new FileInputStream(f1);
		wb = new XSSFWorkbook(fis1);
	}
	
	public String[] excelData(String[] str) {
		sheet = wb.getSheetAt(0);
		str = new String[2];
		str[0] = sheet.getRow(0).getCell(0).getStringCellValue();
		str[1] = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(str[0]);
		System.out.println(str[1]);
		return str;
	}
	

}
