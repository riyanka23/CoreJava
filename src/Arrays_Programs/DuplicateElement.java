package Arrays_Programs;

import java.util.Arrays;

public class DuplicateElement 
{
	
	static  int[] duplicateElement(int[] arr)
	{
		Arrays.sort(arr); //[11,11,22,33,33,44,55]
		int[] newArr=new int[arr.length]; // [0 0 0 0 0 0  0]
		int uniqueCount=0;
		int index=0;
		for(int i=0;i<arr.length;i++) 
		{
			if(i==0 || arr[i]!=arr[i-1])
			{
				uniqueCount++; //
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(i==0 || arr[i]!=arr[i-1]) //i=0==0 true
			{
				newArr[index++]=arr[i];
			}
		}
		return newArr;
	
	}
	public static void main(String[] args)
	{
		int[] arr = {11, 22, 33, 11, 55, 44, 33};
	       
        System.out.println("arr[] = " + Arrays.toString(arr));
        int[] result = duplicateElement(arr);
        System.out.println(Arrays.toString(result));

	}

}
