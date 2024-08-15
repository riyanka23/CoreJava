package This_Super_Programs;

class A
{
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		this.m1(); //calling same call m1 method
		
	}
}

class B extends A
{
	public void m3()
	{
		super.m2();
	}
}
public class ThisSuperInMethods 
{
	public static void main(String[] args) {
		B objb= new B();
		objb.m3();
	}
	
}
