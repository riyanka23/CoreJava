package Arrays_Programs;

import java.util.Arrays;

public class secondLargest
{
	static void secondLarge(int[]arr)
	{
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		System.out.println(arr[arr.length-2]);
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {11,44,22,88,55,77};
		//System.out.println(Arrays.toString(arr));
		secondLarge(arr);
	}

}
