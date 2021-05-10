package PolicyazaarPageLibrary;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClassDemo {
	Properties prop ;
	String filepath = "F:\\Test Data\\Credential.xlsx";
	String propertiesfilepath = "C:\\Users\\Prabhat\\eclipse-workspace\\MavenFirstProject\\src\\main\\java\\ConfigFile\\Config.properties";
	FileReader fr ;
	PropertiesClassDemo()
	{
		try {
			fr = new FileReader(propertiesfilepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}
