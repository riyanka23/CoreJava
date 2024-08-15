package Java_IO_Programs;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileWithFileReader {
	 public static void main(String[] args) {  
	        try (FileReader fr = new FileReader("example.txt")) {  
	            int content;  
	            while ((content = fr.read()) != -1) {  
	                System.out.print((char) content);  
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
}
