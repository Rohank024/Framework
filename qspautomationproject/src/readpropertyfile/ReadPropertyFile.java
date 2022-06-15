package readpropertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	 public static void main(String[] args) throws IOException {
		 
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		String value = prop.getProperty("browser");
		String value1 = prop.getProperty("url");
		String value2 = prop.getProperty("username");
		String value3 = prop.getProperty("password");
		
		
		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
	}
	
	
	
	
}
