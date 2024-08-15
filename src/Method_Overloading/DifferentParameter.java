package Method_Overloading;

public class DifferentParameter
{

	void m1(int a)
	{
		System.out.println("Integer :"+a);
	}
	void m1(String a,int b)
	{
		System.out.println("String :"+a);
	}
	public static void main(String[] args)
	{
		
		DifferentParameter d= new DifferentParameter();
		d.m1(30);
		d.m1("James",111);
	}

}
