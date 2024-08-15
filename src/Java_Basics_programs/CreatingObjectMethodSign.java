package Java_Basics_programs;

public class CreatingObjectMethodSign {
	
	
	public void m1() //non-static method
	{
		System.out.println("m1 method");
	}

	public static void main(String[] args)
	{
		CreatingObjectMethodSign c1= new CreatingObjectMethodSign();
		c1.m1();

	}

}
