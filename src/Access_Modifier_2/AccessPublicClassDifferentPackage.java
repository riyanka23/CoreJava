package Access_Modifier_2;

import Access_Modifier_Programs.PublicClass;

public class AccessPublicClassDifferentPackage 
{
	public static void main(String[] args) {  
        // Create an instance of PublicClass  
        PublicClass publicObj = new PublicClass("Bob", 25);  
        
        // Accessing public fields  
        System.out.println("Accessing public fields from a different package:");  
        System.out.println("Name: " + publicObj.name);  
        System.out.println("Age: " + publicObj.age);  
        
        // Calling the public method  
        System.out.println("Displaying info using public method:");  
        publicObj.displayInfo();  
    }  
}
