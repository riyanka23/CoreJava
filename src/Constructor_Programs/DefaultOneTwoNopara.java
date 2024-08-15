package Constructor_Programs;

class OnConstructor
{
	String name;
	int id;
	
	//parameterized cons
	public OnConstructor(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	//default cons
	public OnConstructor() {
		super();
	}
	
	//One-argument
	//parameterized cons
		public OnConstructor(String name) {
			super();
			this.name = name;
			this.id = 100;
		}

		@Override
		public String toString() {
			return "OnConstructor [name=" + name + ", id=" + id + "]";
		}
		
}



public class DefaultOneTwoNopara {

	public static void main(String[] args)
	{
		OnConstructor c1= new OnConstructor();
		OnConstructor c2= new OnConstructor("James");
		OnConstructor c3= new OnConstructor("Smith", 121);
		
System.out.println("Default con :"+"\n"+c1);
System.out.println("No_argument con :"+"\n"+c2);
System.out.println("Parameterized con :"+"\n"+c3);

	}

}
