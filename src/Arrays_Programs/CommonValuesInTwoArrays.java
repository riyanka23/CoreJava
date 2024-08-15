package Arrays_Programs;

import java.util.Arrays;

public class CommonValuesInTwoArrays 
{
	static void commonValues(int [] arr1, int[] arr2)
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println("common values :"+arr1[i]);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {66, 55, 77, 11, 88};
        System.out.println("arr1[] = " + Arrays.toString(arr1));
        System.out.println("arr2[] = " + Arrays.toString(arr2));
        commonValues(arr1, arr2);
	}

}
