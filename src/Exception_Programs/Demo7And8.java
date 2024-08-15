package Exception_Programs;

import java.util.Scanner;

public class Demo7And8 {

	    public static void main(String[] args) {  
	        Scanner scanner = new Scanner(System.in);  
	        int numerator = 0;  
	        int denominator = 0;  
	        
	        try {  
	            System.out.print("Enter numerator: ");  
	            numerator = scanner.nextInt();  

	            System.out.print("Enter denominator: ");  
	            denominator = scanner.nextInt();  

	            // This may throw ArithmeticException if denominator is 0  
	            int result = numerator / denominator;  
	            System.out.println("Result: " + result);  
	        } catch (ArithmeticException e) {  
	            System.out.println("Error: Cannot divide by zero! " + e.getMessage());  
	        } catch (Exception e) {  
	            System.out.println("An unexpected error occurred: " + e.getMessage());  
	        } finally {  
	            // This block executes regardless of whether an exception was thrown or not  
	            scanner.close(); // Closing the Scanner to prevent resource leaks  
	            System.out.println("Scanner closed.");  
	        } 
	        
	    
	    } 
}
