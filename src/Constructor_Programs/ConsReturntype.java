package Constructor_Programs;

public class ConsReturntype 
{
	    private int number;  
	    private String text;  

	    // Constructor does not allow return type 
	    public ConsReturntype(int number, String text) {  
	        this.number = number;  
	        this.text = text;  
	    }  

	    // Method that returns an int  
	    public int getNumber() {  
	        return number;  
	    }  

	    // Method that returns a String  
	    public String getText() {  
	        return text;  
	    }  

	    // Main method to demonstrate the functionality  
	    public static void main(String[] args) {  
	    	ConsReturntype myObject = new ConsReturntype(42, "Hello, world!");  
	        System.out.println("Number: " + myObject.getNumber()); // Output: Number: 42  
	        System.out.println("Text: " + myObject.getText());     // Output: Text: Hello, world!  
	    }  
	}
