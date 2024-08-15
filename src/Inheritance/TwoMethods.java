package Inheritance;

interface FirstInterface {  
    void firstMethod();  
} 
interface SecondInterface {  
    void secondMethod();  
}  
class oneClass implements FirstInterface, SecondInterface {  
    @Override  
    public void firstMethod() {  
        System.out.println("This is the first method from FirstInterface.");  
    }  

    @Override  
    public void secondMethod() {  
        System.out.println("This is the second method from SecondInterface.");  
    }  
}  
public class TwoMethods {

	public static void main(String[] args)
	{
		oneClass myObject = new oneClass(); // Create an instance of MyClass  

        // Call the methods from the implemented interfaces  
        myObject.firstMethod();  
        myObject.secondMethod();  

	}

}
