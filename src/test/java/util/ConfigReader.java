package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	static String filepath_config;
	private static Properties prop;
	public static String load (String filename,String property) {
		 filepath_config=filename;

			try(InputStream input = new FileInputStream("src/test/resources/object_Repository/"+filepath_config)) {
				prop = new Properties();
				prop.load(input);
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			return prop.getProperty(property);
		
	}
}
