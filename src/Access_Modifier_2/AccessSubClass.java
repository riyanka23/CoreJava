package Access_Modifier_2;

public class AccessSubClass
{
	public static void main(String[] args) {  
        // Create an instance of SubClass  
        SubClass subClassObj = new SubClass("Bob", 25);  
        
        // Accessing fields and methods through subclass  
        subClassObj.show(); // This will call the show method in SubClass  
    }  
}
