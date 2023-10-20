package interfaces2;

public class Car {
	
	// custom data types of Engine and Media type
	
	private Engine engine;
	private Media mediaPlayer;
	
	// constructor:
	
	public Car() {
		this.engine = new PowerEngine();	// engine is parent..so PowerEngine object is created and stored in Engine
		this.mediaPlayer = new Radio();
	}
	
	public Car(Engine engine) {
		this.engine = engine;
		this.mediaPlayer = new Radio();
	}
	
	// methods:
	
	public void start() {
		engine.start();
	}
	
	public void stop() {
		engine.stop();
	}
	
	public void accelerate() {
		engine.acc();
	}
	
	public void startPlayer() {
		mediaPlayer.start();
	}

	public void stopPlayer() {
		mediaPlayer.stop();
	}
}
