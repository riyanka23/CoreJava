package Exception_Programs;

public class ArrayIndexOutOfBoundsExample {

	 public static void main(String[] args) {  
	        // Create an array with 5 elements  
	        int[] numbers = { 1, 2, 3, 4, 5 };  

	        try {  
	            // Attempt to access an index that is out of bounds  
	            int outOfBoundsValue = numbers[10]; // This will trigger ArrayIndexOutOfBoundsException  
	            System.out.println("Value at index 10: " + outOfBoundsValue);  
	        } catch (ArrayIndexOutOfBoundsException e) {  
	            System.out.println("Error: Array index is out of bounds! " + e.getMessage());  
	        } finally {  
	            // This block is executed regardless of whether an exception occurred or not  
	            System.out.println("This is the finally block, executing cleanup if needed.");  
	        }  
	    }  
}
