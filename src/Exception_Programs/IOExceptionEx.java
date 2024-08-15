package Exception_Programs;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionEx
{ 
	    public static void main(String[] args) {  
	        try {  
	            // Attempt to write to a file with an invalid pathname  
	            FileWriter writer = new FileWriter("/invalid/path/file.txt");  
	            writer.write("Hello, World!");  
	            writer.close();  
	        } catch (IOException e) {  
	            System.out.println("Error: IOException occurred! " + e.getMessage());  
	        } finally {  
	            System.out.println("This is the finally block, executing cleanup if needed.");  
	        }  
	    }  
	
}
