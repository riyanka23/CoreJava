package Loops_Programs;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int num= sc.nextInt();
		
		//by using If condition
			if(num%2==0)
			{
				System.out.println("Even number "+num);
			}
			else
			{
				System.out.println("Odd number :"+num);
			}
		
			//by using Switch
			 switch (num % 2) {
	            //Even number has a remainder of 0 if divided by 2
	            case 0:
	                System.out.println(num + " is an Even Number");
	                break;
	            //Odd number has a remainder of 1 if divided by 2
	            case 1:
	                System.out.println(num + " is an Odd Number");
	                break;
	        }
sc.close();
	}

}
