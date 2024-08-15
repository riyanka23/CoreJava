package Arrays_Programs;

import java.util.Arrays;

public class Coping {

	public static int [] copyOfArray(int[]original)
	{
		//create a new Array
		int [] newArr=new int[original.length];
		
		//copy each element to new Array
		for(int i=0;i<original.length;i++)
		{
			newArr[i]=original[i];
		}
		return newArr;
	}
	public static void main(String[] args)
	{

		int[] original= {2,3,5,7,9,8,5};
		int[] copyOfArray = Coping.copyOfArray(original);
		
		 // Print the copied array  
        System.out.println("Original Array: " + Arrays.toString(original));  
        System.out.println("Copied Array: " + Arrays.toString(copyOfArray));  
	}

}
