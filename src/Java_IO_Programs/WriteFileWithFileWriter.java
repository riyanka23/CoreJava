package Java_IO_Programs;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileWithFileWriter {
	 public static void main(String[] args) {  
	        String text = "Hello, World!";  
	        try (FileWriter fw = new FileWriter("outputFileWriter.txt")) {  
	            fw.write(text);  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
}
