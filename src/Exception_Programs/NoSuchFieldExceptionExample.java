package Exception_Programs;

import java.lang.reflect.Field;

public class NoSuchFieldExceptionExample {

	public static void main(String[] args) {
		try {  
            Class<?> cls = SampleClass.class;  
            Field field = cls.getDeclaredField("nonExistentField"); // This will throw NoSuchFieldException  
        } catch (NoSuchFieldException e) {  
            System.out.println("Error: NoSuchFieldException occurred! " + e.getMessage());  
        }  
    }  

    static class SampleClass {  
        private int existingField;  

	}

}
