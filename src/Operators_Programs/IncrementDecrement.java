package Operators_Programs;

public class IncrementDecrement 
{

	static void increment(int a)
	{
		System.out.println("Increment :"+(++a+a++));
	}
	static void Decrement(int a)
	{
		System.out.println("Decrement :"+(--a+a--));
	}
	public static void main(String[] args) {
		
		IncrementDecrement.increment(2);
	IncrementDecrement.Decrement(10);
	}

}
