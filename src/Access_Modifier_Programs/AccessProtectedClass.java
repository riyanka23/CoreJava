package Access_Modifier_Programs;

public class AccessProtectedClass 
{
	public static void main(String[] args) {  
        // Create an instance of ProtectedClass  
        ProtectedClass protectedObj = new ProtectedClass("Alice", 30);  
        
        // Accessing protected fields  
        System.out.println("Accessing protected fields from the same package:");  
        System.out.println("Name: " + protectedObj.name);  
        System.out.println("Age: " + protectedObj.age);  
        
        // Calling the protected method  
        System.out.println("Displaying info using protected method:");  
        protectedObj.displayInfo();  
    }  
}
