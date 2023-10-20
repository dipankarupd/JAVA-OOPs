package interfaces2;

public class Main {
	public static void main(String[] args) {
		
		Car alto  = new Car();	// default constructor so the car will have a power Engine
		alto.start();
		alto.accelerate();
		alto.startPlayer();
		alto.stopPlayer();
		alto.stop();
		
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		
		Car tesla = new Car(new ElectricEngine());	// new car of type electric engine
		tesla.start();
		tesla.accelerate();
		tesla.startPlayer();
		tesla.stopPlayer();
		tesla.stop();
		
	}

}
