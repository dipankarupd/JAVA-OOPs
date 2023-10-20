package interfaces;

public class Main {
	public static void main(String[] args) {
		
		Engine car = new Car();	// accessible are of Engine and which method will be called are in Car
		
		car.acc();
		car.start();
		car.stop();
		//car.brake();	// shows error because Brake is not accessible..only Engine is accessible
		System.out.println(Engine.PRICE);	// the variable of an interface which is accessible
		
		
		
		/* the main problem which occur like this is that the both Multimedia and Engine have same method
		 * so the car class will have a single methods common to both
		 * 
		 * to avoid the problem we create separate classes for the separate interfaces(check other 
		 * package of the interface)
		 * 
		 * 
		 * 
		 */

	}

}
