package Abstract_Class_Programs;


abstract class AbstractDemo2
{
	abstract void m1();
	void m2()
	{
		System.out.println("regular method");
	}
}
class childAbs extends AbstractDemo2
{

	@Override
	void m1() {
		System.out.println("M1 method");
		
	}
	//We cant make the object for th abstract class we can call 
	// abstract class method by referece of subclass
}
public class Demo2 {

	public static void main(String[] args) {
		

	}

}
