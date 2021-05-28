package SampleTestPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelPrac 

{

	static File f ;
	static FileInputStream fis ;
	static XSSFWorkbook wb ;
	static XSSFSheet sh ; 
	
	public static ArrayList<Object> readExcelData() throws IOException
	{
		f = new File("F:\\Test Data\\Credential.xlsx");
		
		fis = new FileInputStream(f);
		
		wb = new XSSFWorkbook(fis) ;
		
		sh = wb.getSheetAt(0);
		int rowcount = sh.getPhysicalNumberOfRows() - sh.getFirstRowNum() ; 
		
		ArrayList<Object> arrdata = new ArrayList<Object>();
		for(int i =1 ; i<= rowcount ; i++)
		{
			
			  String Username = sh.getRow(i).getCell(0).getStringCellValue();
			  
			 String Password = sh.getRow(i).getCell(1).getStringCellValue();
			 
			  Object ob[] ={Username , Password};
			 
			  arrdata.add(ob);
			
   }
		
		return arrdata ; 
	}
	
	
	public void  displayDataOfExcel() throws IOException
	{
	ArrayList<Object> testdata =  ReadExcelPrac.readExcelData();
		
	System.out.println(testdata);
	//return testdata.iterator();
	
	}
	
	
	
	public static void main(String args[]) throws IOException
	{
		
		ReadExcelPrac rep = new ReadExcelPrac();
	rep.displayDataOfExcel();
	
	}
	
}


