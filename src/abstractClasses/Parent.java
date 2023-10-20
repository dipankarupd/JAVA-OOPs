package abstractClasses;


    public abstract class Parent {

        // abstract class can have variables:
        int age;
        Parent(int age) {
            this.age = age;
        }

        static void parent() {
            System.out.println("I am a parent");
        }

        void greet() {
            System.out.println("Good Morning !");
        }

        abstract void career();
        abstract void partner();

	/* if we know a method in a parent class is surely going to be overridden we make the class
abstract. Abstract methods has no body and these methods are always overridden.

We cannot create any obj of the abstract class because if an obje is created the abstract
methods can also be accessed which we do not want but we can create normal methods of this abstract class
also static methods can be created in this class which can be accessed using the class name
*/

}
