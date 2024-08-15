package Exception_Programs;

public class HandleAE 
{

	public static void main(String[] args) 
	{
		try {
			int a= 10;
			int b=5;
			System.out.println("Arithmetic exception :"+(a/b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("The number cant we divided by Zero Please provide number except Zero");
		}

	}

}
