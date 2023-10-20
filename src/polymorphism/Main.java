package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Shapes s1 = new Shapes();
		Triangle s2 = new Triangle();
		Square s3 = new Square();
		Circle s4 = new Circle();
		
		s1.area();
		s2.area();
		s3.area();
		s4.area();
		
		
		// while overriding : what happens is method of the object type is called 
		// whereas while not overriding the method of the refrence is being called
		
		Shapes s5 = new Triangle();
		s5.area();	
		
		Shapes s6 = new Square();
		s6.area();
		
		

		
	}
}
