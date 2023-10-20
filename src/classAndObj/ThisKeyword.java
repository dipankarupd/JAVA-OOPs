// we saw one of the function of this keyword before in AdvConstructor class..
// here we are seeing how we can call another constructor using this keyword

package classAndObj;


class Humans {
    String gender;
    int age;


    // constructor 1:
    Humans() {

        // internally it is same as: new Student("Female" , 22)
        this("Female",22);		// here this keyword helps to call a constructor which takes 2 arguments..ie constructor 2
    }

    // constructor 2:
    Humans(String gender, int age) {

        this.gender = gender;		// one use of this keyword that is already discussed
        this.age = age;
    }
}

public class ThisKeyword {

    public static void main(String[] args) {


        Humans first = new Humans("Male",40); // calls constructor 2
        System.out.println(first.gender + " " + first.age);
        System.out.println();

        Humans second = new Humans(); // calls constructor 1
        System.out.println(second.gender + " " + second.age);
        System.out.println();
    }

}