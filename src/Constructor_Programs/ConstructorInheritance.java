package Constructor_Programs;

class A
{
	String cons;

	public A() {
		super();
	}
	
	public A(String cons) {
		super();
		this.cons = cons;
	}
	
}
class B extends A
{
	String name;

	public B() {
		super();
	}

	public B(String cons) {
		super(cons);
	}
	
	
	
}
public class ConstructorInheritance 
{
	public static void main(String[] args) {
	B objb= new B("A class constructor");
}
}
