package classAndObj;

public class WrapperClass {

    public static void main(String[] args) {
        int a = 10; //  here int is a primitive data type and thus 10 is not considered as an object
        Integer x = 33; //  here on using Integer, we are using an Integer class(Capital letter)
        // and hence 33 is an object now. and Integer is called as a wrapper class
        int c = a+x;
        System.out.println(c);
        System.out.println(x + " " + a);



    }

}