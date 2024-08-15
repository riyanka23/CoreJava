package Arrays_Programs;

public class DifferenceOfLargestAndSmallest 
{
	static int difference(int[] arr)
	{
		int largest=arr[0];
		int smallest=arr[0];
		
		for (int i : arr) {
			if( i > largest)
			{
				largest=i;
			}
		}
		for (int i : arr) {
			if( i < smallest)
			{
				smallest=i;
			}
		}
		return largest-smallest;
	}
	public static void main(String[] args)
	{
		int[] arr= {11,22,33,44,55,66,77,88};
		int result = difference(arr);
		System.out.println(result);

	}

}
