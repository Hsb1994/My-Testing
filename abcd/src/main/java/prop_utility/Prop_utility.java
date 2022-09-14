package prop_utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Prop_utility {
	
	public static String  get_prop_data(String key) {
//		C:\Users\bisht\git\My-Testing\abcd\Test Data\config.properties		
		String value = "";
		try {
			FileInputStream fs = new FileInputStream(".\\Test Data\\config.properties");	
			Properties prop = new Properties();
			prop.load(fs);
			value = prop.getProperty(key);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

}
