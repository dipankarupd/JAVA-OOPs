package classAndObj;

class Student {
    String name;
    int marks;

    // function in the class :

    void greetings () {
        System.out.println("Hello ! my name is " + name);
    }

    Student(String name, int marks) {

        this.name = name;
        this.marks = marks;

    }

    Student(){

    }

}
public class Intro {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Student s1 = new Student("Cat",88);
        s1.greetings();

        System.out.println(s1.marks);
        System.out.println(s1.name);



    }

}
