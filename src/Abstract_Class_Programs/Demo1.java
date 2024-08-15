package Abstract_Class_Programs;

abstract class AbstractDemo
{

	abstract void m1();
	
	
	void m2()
	{
		System.out.println("this is concrete method");
	}
	
}
public class Demo1
{
	public static void main(String[] args) 
	{
		AbstractDemo c1= new AbstractDemo() {
			
			@Override
			void m1() {
				System.out.println("Caling abstract method by creating Anonymous class");
				
			}
		};
		c1.m1();
		c1.m2();
	}

}

