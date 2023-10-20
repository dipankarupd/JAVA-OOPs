package inheritance;

public class NewBox extends Box {

    int weight;

//	public void info() {
//		System.out.println("In the NewBox class");
//	}

    public String name() {
        return "NewBox";
    }

    public void info() {
        System.out.println("In the class " + name());
    }

    NewBox() {
        this.weight = 4;
    }

    NewBox(int l, int b, int h, int weight) {
        super(l, b, h);
        this.weight = weight;
    }

    NewBox(int size, int weight) {
        super(size);
        this.weight = weight;
    }

    NewBox(NewBox old) {
        super.l = old.weight;
        this.b = old.b;
        this.h = old.h;
        this.weight = old.weight;
    }
}
