package PolicyazaarPageLibrary;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadColumnOne 
{	File f ;
FileInputStream fis ;
XSSFWorkbook wb ;
XSSFSheet sh ;
XSSFRow row ; 
XSSFCell cell ; 


public void readColumns(String ColumnName) throws Exception
{
	f = new File("F:\\Test Data\\Credential.xlsx");
	fis = new FileInputStream(f);
	wb = new XSSFWorkbook(fis);
	
	sh = wb.getSheetAt(0);
	int rowcount = sh.getPhysicalNumberOfRows() ; 

		if (ColumnName.equalsIgnoreCase("Username"))
		for(int i=1;i<=rowcount ; i++)
	{
			
		String data = sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println("First Column :: " +data);
	}
	
		else if (ColumnName.equalsIgnoreCase("Password"))
			for(int i=1;i<=rowcount ; i++)
			{
					
				String data = sh.getRow(i).getCell(1).getStringCellValue();
				System.out.println("Second Column :: " +data);
			
			}
					
	
	
}
	public static void main(String[] args) throws Exception{
		
		ReadColumnOne rco = new ReadColumnOne();
		rco.readColumns("Password");
	}

}
