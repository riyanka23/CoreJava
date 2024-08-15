package Java_Basics_programs;

public class LocalAndGlobalVariable {
	int a = 123; //instance variable
	
    void localVariable() {
        int a = 4321; //local variable
        System.out.println("Local variable a : " + a);
    }
	public static void main(String[] args) {
		LocalAndGlobalVariable obj = new LocalAndGlobalVariable();
        System.out.println("Instance variable a : " + obj.a);
        //calling method()
        obj.localVariable();

	}

}
