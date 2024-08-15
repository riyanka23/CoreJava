package Static_programs;

public class staticTest 
{
	//static variable
	static int a=10;
	static int b=20;
	
	//Instance variable
	int a1;
	int b1;
	
	static void m1()
	{
		System.out.println("m1");
		System.out.println("static value of a"+a);
		
		
	}
	static void m2()
	{
		System.out.println("m2");
		System.out.println("static value of b"+b);
	}
	void m3()
	{
		System.out.println("m3");
	}
	void m4()
	{
		System.out.println("m4");
	}
	public static void main(String[] args) 
	{
		staticTest t1= new staticTest();
		t1.a1=100;
		t1.b1=30;
		System.out.println("____Static members______ ");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		System.out.println("____Non-Static members______ ");
		System.out.println(t1.a1);
		System.out.println(t1.b1);
		t1.m3(); t1.m4();
		
		

	}

}
