package Java_IO_Programs;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileWithBufferedOutputStream {
	public static void main(String[] args) {  
        String text = "Hello, World!";  
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("outputBuffered.txt"))) {  
            bos.write(text.getBytes());  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}
