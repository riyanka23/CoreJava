package Method_Overloading;

public class SameNameParameter 
{
		void m1(int a)
		{
			System.out.println("Integer :"+a);
		}
		void m1(String a)
		{
			System.out.println("String :"+a);
		}
	public static void main(String[] args) {

		SameNameParameter s= new SameNameParameter();
		s.m1(100);
		s.m1("Smith");

	}

}
