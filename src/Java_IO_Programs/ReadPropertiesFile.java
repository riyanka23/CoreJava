package Java_IO_Programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	 public static void main(String[] args) {  
	        Properties properties = new Properties();  
	        try (FileInputStream fis = new FileInputStream("config.properties")) {  
	            properties.load(fis);  
	            String value = properties.getProperty("key"); // Change "key" to your desired property key  
	            System.out.println("Value: " + value);  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
}
