package Method_Overloading;

public class TwoMethods
{
	
	void m1(int a)
	{
		System.out.println(a);
	}
	void m1(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		
TwoMethods ts= new TwoMethods();
ts.m1(10);
ts.m1(10, 20);
	}

}
