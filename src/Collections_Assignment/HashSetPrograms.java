package Collections_Assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPrograms 
{

	public static void main(String[] args)
	{
		Set<String> data=new HashSet<>();
		
		 //a. adding elements to the HashSet using add() method
		 	data.add("zero");
	        data.add("one");
	        data.add("two");
	        data.add("three");
	        data.add("four");
	        data.add("five");
	        data.add("six");
	        data.add("seven");
	        data.add("eight");
	        data.add("nine");
	        data.add("ten");
	        data.add("zero");
	        
	        System.out.println("After Adding :"+data);
	        

	        //b. Iterating through the HashSet by using Iterator object
	        Iterator<String> itr = data.iterator();
	        System.out.println("\nIterating through the HashSet : ");
	        while (itr.hasNext()) {
	            System.out.print(itr.next() + " ");
	        }
	        System.out.println(" ");
	        
	        //c. Removing a specific element using remove() method
	        data.remove("zero");
	        System.out.println("\nAfter removing element 'zero' :");
	        System.out.println("data = " + data);

	        //f. Checking if the set is empty using isEmpty() method
	        System.out.println("\nChecking if the set is empty :");
	        System.out.println(data.isEmpty());


	        //h. Finding the size of the HashSet using size() method
	        System.out.println("\nSize of the HashSet : ");
	        System.out.println(data.size());

	        //d. Checking if element is present in the HashSet using contains() method
	        System.out.println("\nElement 'one' is present in the HashSet : ");
	        System.out.println(data.contains("one")); //returns boolean value

	        //j. Removing all elements of the HashSet using clear() method
	        System.out.println("\nAfter removing all elements of the HashSet :");
	        data.clear();
	        

	}

}
