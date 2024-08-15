package Access_Modifier_2;

import Access_Modifier_Programs.ProtectedClass;

public class SubClass extends ProtectedClass
{

	protected SubClass(String name, int age) {
		super(name, age);
	}

	public void show() {  
        // Accessing protected fields from superclass  
        System.out.println("Accessing protected fields from subclass:");  
        System.out.println("Name: " + name);  
        System.out.println("Age: " + age);  
        
        // Calling protected method from superclass  
        displayInfo();  
    }  
}
