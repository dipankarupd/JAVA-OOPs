package classAndObj;

//a singleton class can only create one object:
// to do so we should not allow the use of constructor as whenever a constructor is called
// a new object will be created. but we do only need one object:

public class SingletonClass {
    // creating a constructor for it:

    private SingletonClass() {

    }


    // making a refrence variable of SingletonClasss which points to the object

    private static SingletonClass ref;


    // making getRef method which gives the object:

    public static SingletonClass getRef() {
        if (ref == null) {
            ref = new SingletonClass();
        }
        return ref;
    }
}