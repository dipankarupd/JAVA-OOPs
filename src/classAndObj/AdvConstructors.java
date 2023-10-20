package classAndObj;

public class AdvConstructors {

    public static void main(String[] args) {


        // creating object 1 that calls constructor 1:

        Animal s1 = new Animal();
        System.out.println(s1.name + " " + s1.marks);

        System.out.println();


        // creating object 2 that calls constructor 2:

        Animal s2 = new Animal("Dog",10);
        System.out.println(s2.name + " " + s2.marks);
        System.out.println();


        // creating object 3 that calls constructor 3:

        Animal s3 = new Animal(s1);
        System.out.println(s3.name + " " + s3.marks);
        System.out.println();

    }

}

class Animal {
    String name;
    int marks;

    // constructor 1 it takes no arguments in it
    Animal() {
        this.name = "cat";
        this.marks = 11;
    }

    // constructor 2  it takes two arguments
    Animal(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // constructor 3  it takes a constructor as an argument
    Animal(Animal x) {
        this.name = x.name; 	// here this is s3 and x is s1... s3.name = s1.name
        this.marks = x.marks;
    }
}