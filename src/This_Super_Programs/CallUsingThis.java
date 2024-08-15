package This_Super_Programs;




public class CallUsingThis 
{
	int num;
	String name;
	public CallUsingThis() {
		this(111,"james");
	}

	
	public CallUsingThis(int num, String name) {
		super();
		this.num = num;
		this.name = name;
		System.out.println("Num :"+num+" name :"+name);
	}


	public static void main(String[] args) {
		CallUsingThis c1= new CallUsingThis();
		CallUsingThis c2= new CallUsingThis(121, "Smith");

	}

}
