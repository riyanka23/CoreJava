package Arrays_Programs;

public class SpecificValue 
{
	public static boolean containsCheck(int[] a,int check)
	{
		boolean result=false;
		for(int singleArray: a)
		{
			if(singleArray==check)
				return true;
		}
		return false;
		
		
	}

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6};
		int valueToFind=8;
		
		boolean containsCheck = SpecificValue.containsCheck(arr, valueToFind);
		System.out.println("It contains or not ?"+containsCheck);
		
	}

}
