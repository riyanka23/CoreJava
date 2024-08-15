package Inheritance;

interface A3
{
	default void m1()
	{
		System.out.println("This is deflaut method of interface");
	}
}
class B3 implements A3
{
	
}

public class demo4 
{
	public static void main(String[] args) {
	B3 obj= new B3();
	obj.m1();
}
}
