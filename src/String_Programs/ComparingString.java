package String_Programs;

public class ComparingString
{

	public static void main(String[] args) 
	{
		String s1="compare";
		String s2="Compare";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.startsWith("comp"));
		System.out.println(s2.startsWith("comp"));
		System.out.println(s1.endsWith("pare"));
		
		 System.out.println("Compared : "+s1.compareTo(s2));
		 
		 
		 //Trimming
		 String s="Java developer";
		 System.out.println(s.trim());

		 
		 //10. replacing Characters in strings with
		 String s10= "Replacing string";
		 s10.replace("a", "g");
		 System.out.println("Replaced :"+s10);
		 
		 // Splitting strings with split()
		 String s11="Splitting String";
		 String [] spl= s11.split(s11);
		 
		 for(String i:spl)
		 {
			 System.out.println("Splitted :"+ i);
		 }
		 
		 //12. Converting Numbers to Strings with valueOf()
		 int n=11;
		 //valueOf() method converts different types of values into string.
		 String ts= String.valueOf(n);
		 System.out.println("Converted num to Str :"+ ts +22);
		 
		 //13.Converting integer objects to Strings
		 int is= 11;
		 //integer.toString() method converts int to str
		 String its=Integer.toString(is);
		 System.out.println("converted int to str :"+its+33);
		 
		 //14. Converting to uppercase and lowercase
		 String a= "upper case";
		 String b= "Lower case";
		 
		 System.out.println("convertd to upper case :"+ a.toUpperCase());
		 System.out.println("converted to Lower case :"+ b.toLowerCase());
		 
		 
		 
	}

}
