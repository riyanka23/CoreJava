package Operators_Programs;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter first number : ");
        int a = num.nextInt();
        System.out.print("Enter second number : ");
        int b = num.nextInt();
        System.out.print("Enter second number : ");
        int c = num.nextInt();
        
        //AND Operator
        System.out.println(a > b && a > c); // true  && true  = true
        System.out.println(a < b && a < c); // false && false = false
        System.out.println(a > b && a < c); // true  && false = false
        
        //OR Operator
        System.out.println(a > b || a > c); // true  || true  = true
        System.out.println(a < b || a < c); // false || false = false
        System.out.println(a < b || a > c); // false || true  = true
        
        //Not Operator
        System.out.println(!(a > b));      // NOT true = false
        System.out.println(!(a < b));      // NOT false = true


	}

}
