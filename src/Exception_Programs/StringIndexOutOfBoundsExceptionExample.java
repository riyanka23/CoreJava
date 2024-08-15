package Exception_Programs;

public class StringIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {  
        String str = "Java";  
        try {  
            char ch = str.charAt(10); // This will throw StringIndexOutOfBoundsException  
        } catch (StringIndexOutOfBoundsException e) {  
            System.out.println("Error: StringIndexOutOfBoundsException occurred! " + e.getMessage());  
        }  
    }  
}
