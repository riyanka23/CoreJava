package Arrays_Programs;

import java.util.Arrays;

public class OddAndEvenInArray
{
	static void checkEven(int[] arr)
	{
		System.out.print("Even Numbers are :");
		for (int i : arr) 
		{
			if(i%2==0)
			{
				System.out.print(i+", ");
			}			
		}
	}
	
	static void checkOdd(int[] arr)
	{
		System.out.print("\n"+"Odd Numbers are :");
		for (int i : arr) 
		{
			if(i%2!=0)
			{
				System.out.print(i+", ");
			}
//			
		}
	}
	public static void main(String[] args)
	{
		int [] arr= {11,22,3,33,44,55,6,7,88};
		System.out.println(Arrays.toString(arr));
		checkEven(arr);
		checkOdd(arr);
	}

}
