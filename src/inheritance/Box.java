package inheritance;

public class Box {

    // properties:
    int l;
    int b;
    int h;

    //behaviours:

//	public void info() {
//		System.out.println("new box created ");
//	}

    public String name() {
        return "Box";
    }

    public void info() {
        System.out.println("In the class " + name());
    }

    //constructors:

    Box() {
        this.l = 1;
        this.b = 2;
        this.h = 3;
    }

    Box(int size) {
        this.l = size;
        this.b = size;
        this.h = size;
    }

    Box(int length, int breadth, int height) {
        this.l = length;
        this.b = breadth;
        this.h = height;
    }

    Box(Box oldBox) { 	// copy constructor
        this.l = oldBox.l;
        this.b = oldBox.b;
        this.h = oldBox.h;
    }
}
