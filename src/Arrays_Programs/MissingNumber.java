package Arrays_Programs;

import java.util.Arrays;

public class MissingNumber
{
	static int missingEle(int[] arr)
	{
		int total=55;
		int currentSum=0;
		for(int num :arr)
		{
			currentSum+=num;
		}
		return total-currentSum;
	}
	public static void main(String[] args)
	{
		int [] arr= {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));
		int missingEle = missingEle(arr);
		System.out.println(missingEle);
	}

}
