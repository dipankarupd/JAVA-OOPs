package packages;

public class WorkingClass {

	public static void main(String[] args) {
		
		/* we should not use import keyword if we want to import classes and methods
		 from within the same package folder */
		
		Human first = new Human("Random", 20, 'm' , true);	
		
		Human second = new Human ("Cat" , 30, 'f', false);
		
		System.out.println(first.name);
		System.out.println(second.name);
		
		
	//	greeting();	// static method only contains static data so we must use static before greeting
		
		
		WorkingClass c1 = new WorkingClass();
		c1.greeting(); 		// here we accessed a non static method by creating the object of the class
		
		
		
		// we have a static method in the static class named cool
		
		first.cool();
		
	}

	
	 void greeting() {
		System.out.println("hello world");
	}
}
