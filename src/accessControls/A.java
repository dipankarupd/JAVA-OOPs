package accessControls;

public class A {
    String name;
    private int marks;


    A(String name , int marks){

        this.name = name;
        this.marks = marks;

    }

    A(String name) {
        this.name = name;
    }

    // getter to print the private variables
    public int getMarks() {
        return marks;
    }

    // setter to set the marks:

    public void setMarks() {
        this.marks = 100;
        System.out.println(" " + this.marks);
    }
}
