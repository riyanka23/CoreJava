package Arrays_Programs;

public class AddIntegerValues {

	static int arrSum(int[]arr)
	{
		int sum=0;
		for(int num : arr)
		{
			sum=sum+num;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		
		int[] arr= {10,12,30,50,60};
		
		int result = AddIntegerValues.arrSum(arr);
		System.out.println(result);
}
}
