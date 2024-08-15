package Interface_Programs;

//Define the base interface  
interface BaseInterface {  
 void display();  
}
//Define a derived interface that inherits from BaseInterface  
interface DerivedInterface extends BaseInterface {  
 void show();  
}
//Implement the derived interface in a class  
class MyClass7 implements DerivedInterface {  
 @Override  
 public void display() {  
     System.out.println("Display method implemented in MyClass.");  
 }  

 @Override  
 public void show() {  
     System.out.println("Show method implemented in MyClass.");  
 }  
}
public class program7 {
	    public static void main(String[] args) {  
	        // Create an instance of MyClass  
	        MyClass7 myClass = new MyClass7();  
	        
	        // Call methods from the derived interface  
	        myClass.display(); // Calls the display method  
	        myClass.show();    // Calls the show method  
	    }  
	
}
