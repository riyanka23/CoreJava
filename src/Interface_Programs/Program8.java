package Interface_Programs;

//Define a public interface with fields and methods  
interface MyInterface8 {  
 // Fields (implicitly public, static, and final)  
 int FIELD_ONE = 10;  
 String FIELD_TWO = "Hello, World!";  
 
 // Method to be implemented  
 void displayInfo();  
}
//Implement the interface in a class  
class MyClass8 implements MyInterface8 {  
 @Override  
 public void displayInfo() {  
     System.out.println("Field One: " + FIELD_ONE);  
     System.out.println("Field Two: " + FIELD_TWO);  
 }  
}
public class Program8
{
	    public static void main(String[] args) {  
	        // Create an instance of MyClass  
	        MyClass8 myClass = new MyClass8();  
	        
	        // Call the method from the interface  
	        myClass.displayInfo();  
	    }  

}
