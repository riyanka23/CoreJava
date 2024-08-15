package Arrays_Programs;

import java.util.Arrays;

public class DuplicateArray
{
	static void commonValues(int [] arr1)
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length-1;j++)
			{
				if(arr1[i]==arr1[j+1])
				{
					System.out.println("common values :"+arr1[i]);
				}
			
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr1 = {11, 22, 33, 11, 55};
       
        System.out.println("arr1[] = " + Arrays.toString(arr1));
       commonValues(arr1);
	}

}
