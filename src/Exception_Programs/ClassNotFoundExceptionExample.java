package Exception_Programs;

public class ClassNotFoundExceptionExample {  
    public static void main(String[] args) {  
        try {  
            // Attempt to load a class that does not exist  
            Class.forName("com.example.NonExistentClass"); // This class does not exist  
        } catch (ClassNotFoundException e) {  
            System.out.println("Error: Class not found! " + e.getMessage());  
        } finally {  
            System.out.println("This is the finally block, executing cleanup if needed.");  
        }  
    }  
}
