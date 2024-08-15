package Collections_Assignment;

import java.util.*;

import javax.swing.plaf.synth.SynthStyleFactory;

public class ArrayListProgram 
{
	public static void main(String[] args) 
	{
		List<String> elements= new ArrayList<>();
		List<String> asList = Arrays.asList("one","two","three");
		System.out.println(asList);
		//Adding elements
		elements.add("four");
		elements.add("five");
		elements.add("six");
		elements.add("seven");
		elements.add("eight");
		elements.add("nine");
		elements.add("ten");
		System.out.println("After adding elemts :"+elements);

		//Iterating through Iterator
		Iterator<String> it=elements.iterator();
		System.out.println("By Iterator :");
		while(it.hasNext())
		{
			System.out.print(it.next()+ " ");
		}
		
		//Adding an element at specific index
		elements.add(3, "Nine");
		System.out.println("\nAfter Adding at specific index :"+elements);
		
		//Removing element
		elements.remove(2);
		System.out.println("After removing the element :"+elements);
		
		//Update elements at specific index
		elements.set(1, "java");
		System.out.println("After setting the new value :"+elements);
		
		//Check the element is present at a particular index
		System.out.println("is present or not at which index :"+elements.indexOf("eight"));
		System.out.println("present or not :"+elements.contains("eight"));
		
		//Checking the element is present at a particular index using indexOf() method
		System.out.println("is present or not at which index :"+elements.indexOf("Three"));
		
		//Getting an element at a particular index using get() method
		System.out.println("Getting element :"+elements.get(5));
		
		// Finding the size of the ArrayList using size() method
		System.out.println("Size of array :"+elements.size());
		
		//Removing all elements of the ArrayList using clear() method
		System.out.println("after removing all :");
		elements.clear();
		System.out.println("Elements :"+elements);
	}
}
