package Interface_Programs;

interface Animal
{
	void makeSound();
}

class Tiger implements Animal
{

	@Override
	public void makeSound() {
		System.out.println("tiger can make Sound");
		
	}
	
}
public class Program1 {

	public static void main(String[] args) 
	{
		Tiger t1= new Tiger();
		t1.makeSound();

	}

}
