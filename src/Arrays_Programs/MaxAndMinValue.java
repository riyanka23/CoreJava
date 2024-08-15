package Arrays_Programs;

public class MaxAndMinValue
{
	public static int Max(int []arr)
	{
		int max=arr[0]; //lets suppose 12
		for(int i=0;i<arr.length-1;i++)
		{
			if(max<arr[i+1])
			{
				max=arr[i+1];
			}
		}
		return max;
	}

	public static int Min(int []arr)
	{
		int min=arr[0]; //lets suppose 12
		for(int i=0;i<arr.length-1;i++)
		{
			if(min>arr[i+1])
			{
				min=arr[i+1];
			}
		}
		return min;
	}
	public static void main(String[] args)
	{
		int[] arr= {12,34,89,45,5,88,59};
		int max = MaxAndMinValue.Max(arr);
		int min= MaxAndMinValue.Min(arr);
		System.out.println("max value :"+max);
		System.out.println("min value :"+min);
		

	}

}
