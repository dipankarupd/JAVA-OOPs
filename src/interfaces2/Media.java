package interfaces2;

public interface Media {

	void start();
	void stop();
	
}


// both Media and Engine have same methods start and stop.. to avoid the confusion we create 
// separate classes and then implement engine and media separately in them..
// also engine can be of different types..electrical..diesel.. etc to deal with these we
//create separate classes