package Exception_Programs;

//custom Exception
class MychechedExceptionDemo extends Exception
{
	public MychechedExceptionDemo(String message) 
	 {  
	     super(message);  
	 }  
}


public class Demo5And6
{
	public static void checkExcp() throws MychechedExceptionDemo
	{
		throw new MychechedExceptionDemo("My own class Exception :");
	}
	public static void main(String[] args) throws MychechedExceptionDemo 
	{
		
		Demo5And6.checkExcp();
	}

}
