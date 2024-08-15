package Arrays_Programs;

import java.util.Arrays;

public class SpecifiedElement 
{
	static boolean checkElements(int[] arr)
	{
		
		for (int i : arr) 
		{
			if(i==12 || i==23)
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
		int [] arr= {11,23,33,44,55,66,77,88};
		System.out.println(Arrays.toString(arr));
		boolean checkElements = checkElements(arr);
		System.out.println("Is 12 or 23 is present in Array :"+checkElements);

	}

}
