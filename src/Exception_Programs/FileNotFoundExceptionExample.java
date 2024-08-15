package Exception_Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;  

public class FileNotFoundExceptionExample {  
    public static void main(String[] args) {  
        try {  
            // Attempt to open a file that does not exist  
            FileInputStream fin = new FileInputStream("nonexistentfile.txt");  
        } catch (FileNotFoundException e) {  
            System.out.println("Error: File not found! " + e.getMessage());  
        } finally {  
            System.out.println("This is the finally block, executing cleanup if needed.");  
        }  
    }  
}
