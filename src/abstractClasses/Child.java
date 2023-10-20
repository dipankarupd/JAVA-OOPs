package abstractClasses;

    public class Child extends Parent {


        Child(int age) {
            super(age);	// calls the constructor of the class above it
            System.out.println("I am " + age + " years old");
        }



        @Override
        void career() {
            System.out.println("I am a doctor");

        }

        @Override
        void partner() {
            System.out.println("My partner is a coder");
        }


}
