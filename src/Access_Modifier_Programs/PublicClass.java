package Access_Modifier_Programs;

public class PublicClass
{
	 // Public fields  
    public String name;  
    public int age;  

    // Public constructor  
    public PublicClass(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  

    // Public method  
    public void displayInfo() {  
        System.out.println("Name: " + name + ", Age: " + age);  
    }  
}
