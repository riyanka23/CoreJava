package Interface_Programs;

interface MyInterface3 {  
    void displayMessage();  
    void displayAnotherMessage(); // Not implemented in the class  
}  

class MyClass3 implements MyInterface3 {  
    @Override  
    public void displayMessage() {  
        System.out.println("Hello, this is the implemented method!");  
    }  

    @Override  
    public void displayAnotherMessage() {  
        // You can implement this method with a default behavior if needed  
        System.out.println("This method is not utilized in this implementation.");  
    }  
}  
public class Program3 {

	public static void main(String[] args) 
	{
		// Create an instance of MyClass  
        MyInterface3 myInterface = new MyClass3();  
        
        // Call the implemented method using the interface reference  
        myInterface.displayMessage(); // Call the implemented method  
        
        // This line will now work, but we have implemented it simply to show the full example.  
        myInterface.displayAnotherMessage(); // Call the method that has an implementation   

	}

}
