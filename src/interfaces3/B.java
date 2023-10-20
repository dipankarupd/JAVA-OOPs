package interfaces3;

public interface B extends A {	// interference... greet() is now the property/behaviour of B also
	
	// interface to interface inheritance...keyword extends
    // interface to classes inheritance...keyword implements

	void welcome();
}
