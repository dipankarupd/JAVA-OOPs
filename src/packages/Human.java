package packages;

public class Human {
	
	String name;
	int age;
	char gender;
	boolean isMarried;
	
	static void cool() {
		System.out.println("cool!");
	}

	
	// creating a constructor for this class:
	
	public Human(String name, int age,char gender, boolean isMarried) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isMarried = isMarried;
		
		//cool(); 
		
	}
}
