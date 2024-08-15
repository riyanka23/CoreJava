package Exception_Programs;

import java.lang.reflect.Method;  

public class NoSuchMethodExceptionExample {  
    public static void main(String[] args) {  
        try {  
            Class<?> cls = SampleClass.class;  
            Method method = cls.getDeclaredMethod("nonExistentMethod"); // This will throw NoSuchMethodException  
        } catch (NoSuchMethodException e) {  
            System.out.println("Error: NoSuchMethodException occurred! " + e.getMessage());  
        }  
    }  

    static class SampleClass {  
        public void existingMethod() {}  
    }  
}
