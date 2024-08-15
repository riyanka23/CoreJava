package Exception_Programs;

public class NullPointerExceptionExample {
	 public static void main(String[] args) {  
	        String str = null;  
	        try {  
	            System.out.println(str.length()); // This will throw NullPointerException  
	        } catch (NullPointerException e) {  
	            System.out.println("Error: NullPointerException occurred! " + e.getMessage());  
	        }  
	    }  
}
