package Arrays_Programs;

import java.util.Arrays;

public class ReverseArray
{
	
	public static int[] reversedArray(int[]arr)
	{
		int [] newArr= new int[arr.length];
		 for (int i = 0; i < arr.length; i++)  
	        {  
	            newArr[i] = arr[arr.length - 1 - i]; // Copy elements in reverse order
	            
	        }  
		return newArr;
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr= {12,13,14,15,16};
		int[] reversedArr = ReverseArray.reversedArray(arr);
		System.out.println("Original Array :"+Arrays.toString(arr));
		System.out.println("Reversed Array :"+Arrays.toString(reversedArr));
	}

}
