package DataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatafromExcel 
{

File f ;
FileInputStream fis ; 

XSSFSheet sheet ;

XSSFWorkbook wb ;
ArrayList<String> al ;
public void readDataFromExcel() throws FileNotFoundException , IOException
{
	f= new File("F:\\Test Data\\Credential.xlsx");
	fis = new FileInputStream(f) ;
	wb = new XSSFWorkbook(fis);
	sheet = wb.getSheet("Sheet1");
	
	int rowcount = sheet.getPhysicalNumberOfRows() -1;
	 al = new ArrayList<String>();
	
	System.out.println("Row count :: " + rowcount);
	for(int i=1 ; i< rowcount ; i++)
	{
	String username = sheet.getRow(i).getCell(0).getStringCellValue();
	
	al.add(username);
    String password = sheet.getRow(i).getCell(1).getStringCellValue();
    al.add(password);
    }
	
	 System.out.println(al); 
	   
	 System.out.println("*****************************************");
	 Iterator<String> i = al.iterator() ; 
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }
	
	 
	 
	 
}

public static void main(String args[]) throws FileNotFoundException , IOException
{
	
	DatafromExcel de = new DatafromExcel();
	
	de.readDataFromExcel();
	
}
	
	
}
