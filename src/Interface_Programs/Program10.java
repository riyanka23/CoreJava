package Interface_Programs;

//Define a public interface with fields and private methods  
interface MyInterface10 {  
 // Public fields (implicitly public, static, and final)  
 int PUBLIC_FIELD = 100;  
 
 // Private method  
 private void privateHelper() {  
     System.out.println("This is a private helper method.");  
 }  

 // Default method that can access private method  
 default void displayHelper() {  
     privateHelper();  
 }  

 // Method to be implemented  
 void displayInfo();  
}

class MyClass10 implements MyInterface10 {  
    @Override  
    public void displayInfo() {  
        System.out.println("Public Field: " + PUBLIC_FIELD);  
        displayHelper(); // Call the default method  
    }  
}  
public class Program10 
{
	public static void main(String[] args) {  
        // Create an instance of MyClass  
        MyClass10 myClass = new MyClass10();  
        
        // Call the method from the interface  
        myClass.displayInfo();  
    }  
}
