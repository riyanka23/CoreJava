package Collections_Assignment;

import java.util.HashMap;
import java.util.Map;

public class HashMapprogram 
{

	public static void main(String[] args)
	{
		Map<Integer,String> stuData=new HashMap<>();
		stuData.put(1, "Aditya");
		stuData.put(2, "Riyanka");
		stuData.put(3, "harsh");
		stuData.put(4, "shalu");
		stuData.put(5, "sunita");
		stuData.put(6, "santosh");
		stuData.put(7, "rishi");
		stuData.put(8, "anjani");
		stuData.put(9, "manya");
		stuData.put(10, "pinku");
		
		System.out.println("After adiing :"+stuData);
		
		//Fetching the value of a Key using get() method
		System.out.println("Name of Student at id 6:"+stuData.get(6));
		
		// Checking if the given Key is in the Map using containsKey() method
		System.out.println("id=1 in HashMap :"+stuData.containsKey(3));
		
		//Checking if the value is in the Map using containsValue() method
		System.out.println("\nStudent Name = 'Aditya' is in the map :"+stuData.containsValue("Aditya"));
		
		//Checking if the map is empty using isEmpty() method
		 System.out.println("\nChecking if the map is empty :"+stuData.isEmpty());
		 
		 //Printing the size of the Map to the console using size() method
		 System.out.println("\nThe size of the Map is :"+stuData.size());
		 
		 //Printing all the Keys of the map to the console using keySet() method
		 System.out.println("\nAll ID No of the students :"+stuData.keySet());
		 
		 //Removing a specific Key-value pair using remove() method
		 System.out.println("\nRemoved ID no = 4 ,Student name = 'Shalu' : "+stuData.remove(4, "shalu"));
		 System.out.println(stuData);
		 
		 //Copying all the elements of the Map to another Map using puttAll() method
		 System.out.println("copy all Elements :");
		 Map<Integer, String> newStu= new HashMap<Integer, String>();
		 newStu.putAll(stuData);
	System.out.println(newStu);	 
		
		

	}

}
