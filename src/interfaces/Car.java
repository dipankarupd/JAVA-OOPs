package interfaces;

public class Car implements Engine, Brake, MultiMedia {

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
		System.out.println("I brake like a normal car");
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("I start like a normal car");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("I stop like a normal car");
		
	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("I accelerate like a normal car");
		
	}
	
/* here if two interfaces which are being inherited have the same methods..it still works fine
* because the methods are overridden and the child class writes on that method
* 
* eg: as engine and multi-media both have the same methods start and stop..still they both can 
* be inherited because those functions are being overridden by the child class's methods
* 
* 
* 
* Two classes which are unrelated to each other can also implement the same interfaces
*/
}
