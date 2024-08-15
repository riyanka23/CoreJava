package Interface_Programs;

//Define the first interface with one method  
interface FirstInterface {  
 void firstMethod();  
}
//Define the second interface with one method  
interface SecondInterface {  
 void secondMethod();  
}
class MyClass4 implements FirstInterface, SecondInterface {  
    @Override  
    public void firstMethod() {  
        System.out.println("This is the first method from FirstInterface.");  
    }  

    @Override  
    public void secondMethod() {  
        System.out.println("This is the second method from SecondInterface.");  
    }  
}  
//Implement both interfaces in a single class  
class MyClass implements FirstInterface, SecondInterface {  
 @Override  
 public void firstMethod() {  
     System.out.println("This is the first method from FirstInterface.");  
 }  

 @Override  
 public void secondMethod() {  
     System.out.println("This is the second method from SecondInterface.");  
 }  
}
public class Program4 
{
	public static void main(String[] args) {  
        // Create an instance of MyClass  
        MyClass4 myClass = new MyClass4();  
        
        // Call the methods from both interfaces  
        myClass.firstMethod(); // Call the method from FirstInterface  
        myClass.secondMethod(); // Call the method from SecondInterface  
    }  

}
