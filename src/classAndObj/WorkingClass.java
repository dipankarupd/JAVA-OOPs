package classAndObj;

public class WorkingClass {

    public static void main(String[] args) {


        // creating an object of SingletonClass:

        SingletonClass obj1 = SingletonClass.getRef();

        SingletonClass obj2 = SingletonClass.getRef();

        // here both reference variables obj1 and obj2 point to the same class

    }

}