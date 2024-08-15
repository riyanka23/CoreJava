package Access_Modifier_Programs;


class ParentClass {  
    // Private fields  
    private String name;  
    private int age;  

    // Constructor  
    public ParentClass(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  

    // Private method  
    private void displayInfo() {  
        System.out.println("Name: " + name + ", Age: " + age);  
    }  

    // Public method to access private members  
    public void show() {  
        System.out.println("Showing info:");  
        displayInfo();  // Call private method  
    }  

    // Main method  
    public static void main(String[] args) {  
        ParentClass parent = new ParentClass("Alice", 30);  
        parent.show(); // Show information  

        // Trying to access private fields directly (This will cause an error)  
        // System.out.println("Name: " + parent.name); // Uncommenting this will cause a compilation error  
        // System.out.println("Age: " + parent.age); // Uncommenting this will cause a compilation error  
    }  
}  

// Sub Class  
class SubClass extends ParentClass {  
    public SubClass(String name, int age) {  
        super(name, age);  
    }  

    public void attemptAccess() {  
        // Attempt to access private fields and methods from ParentClass  
        // This will not compile because name and age are private in ParentClass  
        // System.out.println("Name: " + name); // Uncommenting this will cause a compilation error  
        // System.out.println("Age: " + age); // Uncommenting this will cause a compilation error  

        // Attempt to call private method  
        // displayInfo();  // Uncommenting this will cause a compilation error  
    }  
}  
public class SubClassTest {

	public static void main(String[] args)
	{
		SubClass sub = new SubClass("Bob", 25);  
        sub.attemptAccess(); // This will execute, but will not access private fields/methods.  


	}

}
