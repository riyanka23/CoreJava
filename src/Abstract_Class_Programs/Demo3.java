package Abstract_Class_Programs;

abstract class Animal {  
    // Abstract method (no body)  
    public abstract void makeSound();  

    // Non-abstract method  
    public void sleep() {  
        System.out.println("The generic animal is sleeping.");  
    }  
}  

class Dog extends Animal {  
    // Implementation of the abstract method  
    @Override  
    public void makeSound() {  
        System.out.println("The dog barks.");  
    }  
}  
public class Demo3 {

	public static void main(String[] args) {
		// Creating an instance of Dog which is a subclass of Animal  
        Animal myDog = new Dog();  

        // Accessing the non-abstract method from the abstract class  
        myDog.sleep();  

        // Calling the implemented abstract method  
        myDog.makeSound();  

	}

}
