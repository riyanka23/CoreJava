package Loops_Programs;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int a= sc.nextInt();
		System.out.println("Enter a number :");
		int b= sc.nextInt();
		System.out.println("Enter a number :");
		int c= sc.nextInt();
		
		 if ((a > b) && (a > c)) {
	            System.out.println("The Largest Number is : " + a);
	        }
	        //Executes if b is largest
	        else if ((b > a) && (b > c)) {
	            System.out.println("The Largest Number is : " + b);
	        }
	        //Executes if a,b are not largest
	        else {
	            System.out.println("The Largest Number is : " + c);
	        }
		sc.close();

	}

}
