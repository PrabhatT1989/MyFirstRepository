package PolicyazaarPageLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	File f ; 
	FileOutputStream fis ; 
	XSSFWorkbook wb ;
	XSSFSheet sh ;
	XSSFRow row ;
	XSSFCell cell ; 
	
	public void writeExcel() throws Exception
	{
		f = new File("F:\\Test Data\\WriteExcel.xlsx") ; 
		fis = new FileOutputStream(f) ; 
		wb = new XSSFWorkbook();
		wb.write(fis);
		
		sh = wb.getSheetAt(0);
		
		sh.getRow(0).getCell(0).setCellValue("Username");
		
		
		
	}
	
	public static void main(String[] args)  throws Exception
	{
		WriteExcel we = new WriteExcel() ; 
		we.writeExcel();
		
	}

}
