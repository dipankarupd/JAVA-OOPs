package abstractClasses;

    public class Main {
        public static void main(String[] args) {
            Child child = new Child(20);
            child.career();
            child.greet();// method of parent class
            Parent.parent();
        }



}
