package Arrays_Programs;

import java.util.Arrays;
import java.util.Scanner;

/*Write a program to find the index of an array element*/
public class FindIndex
{
	static void arrIndex(int []arr,int n)
	{
		for(int i=0; i<arr.length;i++)
		{
			if(n==arr[i])
			{
				System.out.println(n+ " is a index "+i);
			}
		}
	}
	public static void main(String[] args)
	{
		int index;
		int [] arr= {11,22,33,44,55,66,77};
		System.out.println(Arrays.toString(arr));
		
		System.out.print("Select any value to find Index of array : ");
        Scanner sc = new Scanner(System.in);
        int index1 = sc.nextInt();
        arrIndex(arr, index1);
	}

}
