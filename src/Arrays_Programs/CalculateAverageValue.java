package Arrays_Programs;

public class CalculateAverageValue
{

	static void avgArray(int []arr)
	{
		int sum=0;
		for(int i: arr)
		{
			sum=sum+i;
		}
		
		int avg= sum/arr.length;
		System.out.println("The average value of arrya is :"+avg);
	}
	public static void main(String[] args) 
	{
		
		int []arr= {1,2,3,4,5,6};
		avgArray(arr);
	}

}
