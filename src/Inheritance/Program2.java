package Inheritance;

interface MyInterface 
{  
    void displayMessage();  
    void anotherMethod();  
}  

class MyClass implements MyInterface
{

	@Override
	public void displayMessage() {
		System.out.println("Hello from MyClass!"); 
		
	}

	@Override
	public void anotherMethod() {
		
		
	}
	
}
public class Program2 {

	public static void main(String[] args) {
		MyClass myobj = new MyClass();  
		myobj.displayMessage(); // Calling the implemented method 

	}

}
