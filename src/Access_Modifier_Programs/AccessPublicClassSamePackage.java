package Access_Modifier_Programs;

public class AccessPublicClassSamePackage
{
	public static void main(String[] args) {  
        // Create an instance of PublicClass  
        PublicClass publicObj = new PublicClass("Alice", 30);  
        
        // Accessing public fields  
        System.out.println("Accessing public fields from the same package:");  
        System.out.println("Name: " + publicObj.name);  
        System.out.println("Age: " + publicObj.age);  
        
        // Calling the public method  
        System.out.println("Displaying info using public method:");  
        publicObj.displayInfo();  
    }  
}
