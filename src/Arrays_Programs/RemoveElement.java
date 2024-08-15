package Arrays_Programs;  

import java.util.Arrays;  

public class RemoveElement {  

    public static int[] removeElement(int[] arr, int remove) {  
        int count = 0;  

        // First, count how many times 'remove' appears in 'arr'  
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] == remove) {  
                count++;  
            }  
        }  

        // Create the new array with the appropriate size  
        int[] newArr = new int[arr.length - count];  
        int index = 0; // Index for newArr  

        // Populate the new array with values that are not 'remove'  
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] != remove) {  
                newArr[index] = arr[i]; // Assign the value to newArr  
                index++; // Increment index for newArr  
            }  
        }  
        return newArr; // Return the new array  
    }  

    public static void main(String[] args) {  
        int[] arr = {1, 2, 3, 4, 5, 6};  
        int valueToRemove = 5;  
        int[] removed = RemoveElement.removeElement(arr, valueToRemove);  
        System.out.println(Arrays.toString(removed)); // Output: [1, 2, 3, 4, 6]  
    }  
}