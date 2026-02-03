package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	
	public static String read(String propertyName) throws IOException
	{
		String path = "D:\\TRAININGS\\Selenium_JAVA_JULY25_WEEKEND\\SELENIUM _JAVA_SEPT_BATCH_GIT_LOCAL\\Sept25Batch\\POM_Project\\src\\utility\\Config.properties";
		FileInputStream file = new  FileInputStream(path);
		Properties prop = new Properties();
		prop.load(file);
		String propertyValue = prop.getProperty(propertyName);
		
//		System.out.println(data);
		
		return propertyValue;
	}
	
	


}
