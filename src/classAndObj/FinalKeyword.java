package classAndObj;

public class FinalKeyword {

    public static void main(String[] args) {

        final Student s1 = new Student();

        s1.name = "Dipankar";
        s1.marks = 10;

        //s1 = new Student();		// error..cannot assign the local variable further

    }

}