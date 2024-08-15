package Operators_Programs;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) 
	{
		Scanner num = new Scanner(System.in);
		System.out.print("Enter first number : ");
        int a = num.nextInt();
        System.out.print("Enter second number : ");
        int b = num.nextInt();
 
        System.out.println(a < b);  //less than ( < )
        System.out.println(a > b);  //greater than ( > )
        System.out.println(a <= b); //less than or equals( <= )
        System.out.println(a >= b); //greater than or equals( >= )

	}

}
