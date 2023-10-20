package interfaces;

public interface Engine {
	
	
	int PRICE = 500000;
	
	void start();
	void stop();
	void acc();
	
	

}

/*
 * they are like class but the difference is that they have all the methods in them as abstract
 * (to override) and all their variables/instances as final and static.
 * it is by default so no need to write final static int while declaring an instance
 * and also no need to write the abstract keyword for the body also..
 * 
 * Interfaces are used mostly for the process of multiple inheritance in java where two or more 
 * interfaces are inherited to a class using the keyword implements...as done in the car class
 * 
 * refrence: https://www.geeksforgeeks.org/interfaces-in-java/
 */
