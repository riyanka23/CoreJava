package Java_IO_Programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileWithBufferedWriter {
	 public static void main(String[] args) {  
	        String text = "Hello, World!";  
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter("outputBufferedWriter.txt"))) {  
	            bw.write(text);  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    } 
}
