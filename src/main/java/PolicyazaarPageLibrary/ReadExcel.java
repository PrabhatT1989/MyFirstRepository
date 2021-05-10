package PolicyazaarPageLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel  { 
	
	String filepath = "F:\\Test Data\\Credential.xlsx" ;
	File f ;
	FileInputStream fis ;
	XSSFWorkbook wb ;
	XSSFSheet sh ;
	XSSFRow row ; 
	XSSFCell cell ; 
	ArrayList<String> arr = new ArrayList<String>();
	
	
	public void readExcel() throws Exception
	{
		 f = new File(filepath);
		  fis  = new FileInputStream(f);
		 wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		
		for(int i=1  ; i< sh.getPhysicalNumberOfRows()-sh.getFirstRowNum() ; i++)
		{
			for(int j=0 ;j<=1 ;j++)
			{
			String data =sh.getRow(i).getCell(j).getStringCellValue();
			arr.add(data);
			System.out.print(data + " ");
			
			
			}
		System.out.println("\n");
		}
		
		System.out.println("Content Inside Array List : " +arr);
		
	}
	
	public static void main(String args[]) throws Exception
	{
		ReadExcel re = new ReadExcel();
		re.readExcel();
		
	}

}
