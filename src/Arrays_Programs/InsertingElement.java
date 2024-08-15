package Arrays_Programs;

import java.util.Arrays;

public class InsertingElement
{

	public static int[] insertElement(int[] arr,int insertEle,int pos)
	{
		// Check if the position is valid  
        if (pos < 0 || pos > arr.length) {  
            throw new IllegalArgumentException("Invalid position: " + pos);  
        }
		
        //create a new Array with plus 1 index 
        int[] newArr= new int[arr.length+1];
        
        //copy elemt to new Array
        for(int i=0;i<newArr.length;i++)
        {
        	if(i<pos) //5==5
        	{
        		newArr[i]=arr[i]; //1,2,3,4
        	}
        	else if(i==pos)
        	{
        		newArr[i]=insertEle;
        	}
        	else
        	{
        		newArr[i]=arr[i-1]; //right shift
        	}
        }
        return newArr;
	}
	
	public static void main(String[] args)
	{
		int[] arr= {12,34,46,45,26,88,59};
		int insertEle=57;
		
		int pos=5; //index=5
		int[] newone = InsertingElement.insertElement(arr, insertEle, pos);
		 System.out.println("Original Array: " + Arrays.toString(arr));  
	        System.out.println("Inserted Array: " + Arrays.toString(newone)); 
		
		
		
		

	}

}
