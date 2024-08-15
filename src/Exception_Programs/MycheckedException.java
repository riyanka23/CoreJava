package Exception_Programs;

//Custom exception class (optional)  
class exceptionDemo extends Exception
{  
 public exceptionDemo(String message) 
 {  
     super(message);  
 }  
}  

public class MycheckedException {  

 // Method that throws an exception  
 public void doSomething() throws exceptionDemo {  
     throw new exceptionDemo("An error occurred in doSomething method");  
 }  

 public static void main(String[] args) throws exceptionDemo {  
	 MycheckedException example = new MycheckedException();  
     example.doSomething(); // This will throw the exception  
 }  
}

