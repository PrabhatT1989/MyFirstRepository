package PolicyazaarPageLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadColumns 
{
	File f ;
	FileInputStream fis ;
	XSSFWorkbook wb ;
	XSSFSheet sh ;
	XSSFRow row ; 
	XSSFCell cell ; 
	
	public void readColumns() throws Exception
	{
		f = new File("F:\\Test Data\\Credential.xlsx");
		fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		
		sh = wb.getSheetAt(0);
		for (int i=0;i<10;i++) 
		{
		String data = sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println(  data);	
		}
	
	
	}
	
	public static void main(String args[]) throws Exception
	{
		ReadColumns rc = new  ReadColumns();
		rc.readColumns();
		
	}

}
