package packages;

public class WorkingClass2 {
	
	static int a = 20;
	static int b;
	
	
	//static block
	static {	 // this block will run only once whenever the object of this class is created
		System.out.println("Hello from static block!");
		b = a + 5;
	}
	
	public static void main(String[] args) {
		
		WorkingClass2 x = new WorkingClass2();	// first object created so static block runs
		
		System.out.println(x.a + " " + x.b);
		
		System.out.println();
		
		WorkingClass2.a = 33;
		
		WorkingClass2 y = new WorkingClass2();	// second object created so static block does not run
		System.out.println(y.a + " " + y.b);
		
	}
	
}
