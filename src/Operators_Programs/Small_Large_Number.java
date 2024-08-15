package Operators_Programs;

import java.util.Scanner;

public class Small_Large_Number {

	public static void main(String[] args)
	{
		Scanner num = new Scanner(System.in);
		System.out.print("Enter first number : ");
        int a = num.nextInt();
        System.out.print("Enter second number : ");
        int b = num.nextInt();
        
        //by using Ternary Operator
		 int min = (a<b)?a:b;
	        int max = (a>b)?a:b;
	        System.out.println("Smaller Number is " + min);
	        System.out.println("Larger Number is " + max);

	        //Same logic with if and else statements takes more lines to code
	        if (a > b) {
	            System.out.println("Larger Number is " + a);
	        } else {
	            System.out.println("Smaller Number is " + a);
	        }
	        if (b > a) {
	            System.out.println("Larger Number is " + b);
	        } else {
	            System.out.println("Smaller Number is " + b);
	        }

	}

}
