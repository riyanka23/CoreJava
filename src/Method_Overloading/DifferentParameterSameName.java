package Method_Overloading;

public class DifferentParameterSameName 
{
	int m1(int a,int b)
	{
		return a+b;
		
	}
	
	String m1(String a,String b)
	{
		return a.concat(b);
		
	}

	public static void main(String[] args)
	{
		DifferentParameterSameName d1= new DifferentParameterSameName();
		System.out.println(d1.m1(100, 200));
		System.out.println(d1.m1("Hyderabad", " City"));
	}

}
