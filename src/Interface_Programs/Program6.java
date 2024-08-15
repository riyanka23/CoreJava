package Interface_Programs;


//Define an interface with a default method  
interface MyInterface {  
 default void show() {  
     System.out.println("Default implementation of show() in MyInterface.");  
 }  
}

//Implement the interface in a class without overriding the default method  
class MyClass6 implements MyInterface {  
 // No need to override the show() method  
}
public class Program6 
{
	
	    public static void main(String[] args) {  
	        // Create an instance of MyClass  
	        MyClass6 myClass = new MyClass6();  
	        
	        // Call the show method which uses the default implementation  
	        myClass.show();  
	    }  
	
}
