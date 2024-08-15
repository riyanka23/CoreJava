package Exception_Programs;

public class NumberFormatExceptionExample {
	 public static void main(String[] args) {  
	        String invalidNumber = "abc";  
	        try {  
	            int num = Integer.parseInt(invalidNumber); // This will throw NumberFormatException  
	        } catch (NumberFormatException e) {  
	            System.out.println("Error: NumberFormatException occurred! " + e.getMessage());  
	        }  
	    }  
}
