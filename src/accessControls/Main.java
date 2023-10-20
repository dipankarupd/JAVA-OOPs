package accessControls;

public class Main
{
    public static void main(String[] args) {

        A obj = new A("Aayush" , 100);

        System.out.println(obj.name +  " " + obj.getMarks());


        A obj2 = new A("Ayush");

        System.out.print(obj2.name);
        obj2.setMarks();
    }
}
