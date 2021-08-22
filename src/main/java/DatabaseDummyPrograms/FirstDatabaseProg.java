 package DatabaseDummyPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstDatabaseProg 
{

	public void  databaseConnection() throws SQLException
	{
	Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/firstdatabase","root","");
	
	
	Statement stmt = con.createStatement();
	
	ResultSet rs= stmt.executeQuery("select * from customer where custid= \'2\'");
	
	while(rs.next())
	{
	System.out.println("Customer Name :: " + rs.getString("Name") + "  Customer ID ::" + rs.getString("CustId"));
	}
	
	con.close();;
	}
	
	
public static void main(String args[]) throws SQLException
{
	
	FirstDatabaseProg fdp = new FirstDatabaseProg();
	
	fdp.databaseConnection();

}
	
	
	
}
