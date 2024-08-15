package Java_IO_Programs;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileWithInputStream
{
	public static void main(String[] args) throws IOException {  
		FileInputStream fis = new FileInputStream("example.txt");
        try (fis) {  
            int content;  
            while ((content = fis.read()) != -1) {  
                System.out.print((char) content);  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}
