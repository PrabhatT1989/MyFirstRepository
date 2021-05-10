package PolicyazaarPageLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenPrac
{
	
	File f ;
	FileInputStream fis ;
	XSSFWorkbook wb ;
	XSSFSheet sh ; 
	ArrayList<String> arr = new ArrayList<String>();
	String testdatapath = "F:\\Test Data\\Credential.xlsx" ; 
	
	public void getData() throws Exception
	{
		f= new File(testdatapath);
		fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheetAt(0);
		int rowcount = sh.getPhysicalNumberOfRows() - sh.getFirstRowNum() ;
	
		for(int i=1 ; i< rowcount; i++)
		{
			
		}
		
		
		
	}

	
}
