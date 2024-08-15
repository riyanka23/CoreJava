package Access_Modifier_Programs;

public class ProtectedClass
{
	// Protected fields  
    protected String name;  
    protected int age;  

    // Protected constructor  
    protected ProtectedClass(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  

    // Protected method  
    protected void displayInfo() {  
        System.out.println("Name: " + name + ", Age: " + age);  
    }  
}
