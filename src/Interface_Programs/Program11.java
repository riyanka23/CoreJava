package Interface_Programs;

interface Vehicle {  
    // Static final variables (implicitly public, static, and final)  
    int MAX_SPEED = 120;  // Maximum speed for all vehicles  
    String TYPE = "Vehicle"; // Common type for all vehicles  

    // Method to display vehicle information  
    void displayInfo();  
}  

class Car implements Vehicle {  
    @Override  
    public void displayInfo() {  
        System.out.println("Type: " + TYPE);  
        System.out.println("Max Speed: " + MAX_SPEED + " km/h");  
        System.out.println("This is a Car.");  
    }  
} 

class Motorcycle implements Vehicle {  
    @Override  
    public void displayInfo() {  
        System.out.println("Type: " + TYPE);  
        System.out.println("Max Speed: " + MAX_SPEED + " km/h");  
        System.out.println("This is a Motorcycle.");  
    }  
}  
public class Program11 {
	public static void main(String[] args) {  
        // Create instances of Car and Motorcycle  
        Vehicle myCar = new Car();  
        Vehicle myMotorcycle = new Motorcycle();  
        
        // Display information for both vehicles  
        myCar.displayInfo();  
        System.out.println(); // Just for separation in output  
        myMotorcycle.displayInfo();  
    }  
}
