package Java_IO_Programs;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileWithOutputStream
{
	 public static void main(String[] args) {  
	        String text = "Hello, World!"; 
	        
	        try (FileOutputStream fos = new FileOutputStream("output.txt")) {  
	            fos.write(text.getBytes());  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
}
