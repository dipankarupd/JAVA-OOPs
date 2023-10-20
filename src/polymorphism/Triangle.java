package polymorphism;

public class Triangle extends Shapes {
	
	@override // annotation override is created... when the method is over ridden this annotation does not show any errors otherwise shows some errors
	 void area() {
		System.out.println("Area = 0.5 * b * h");
	}

	
//	final void jump() {		// this shows error as final method cannot override 
//		System.out.println("b");
//	}
}
