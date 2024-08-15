package Exception_Programs;

import java.util.Scanner;

public class MultipleCatchExample {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);  

        try {  
            System.out.print("Enter a number: ");  
            int number = scanner.nextInt();  

            // This may throw ArithmeticException if number is 0  
            int result = 100 / number;  
            System.out.println("Result: " + result);  
            
            // This may throw ArrayIndexOutOfBoundsException  
            int[] array = new int[5];  
            System.out.println("Accessing array index 10: " + array[10]);  

        } 
        catch (ArithmeticException e) {  
            System.out.println("Error: Cannot divide by zero! " + e.getMessage());  
        } 
        catch (ArrayIndexOutOfBoundsException e) {  
            System.out.println("Error: Array index out of bounds! " + e.getMessage());  
        }
        catch (Exception e) {  
            System.out.println("An unexpected error occurred: " + e.getMessage());  
        } 

	}

}
