package exceptions;

public class Main {

    public static void main(String[] args)  throws Exception{
        int a = 5;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        // we can add multiple catch statements:
//		catch(ArithmeticException e) {
//			this can be used but if used below the Exception block it has no significance as
        // ArithmeticException is the subclass of class Exception... so should have been used at first itself
//		}

        finally {
            System.out.println("Hello !!!");
        }


        if(b == 0 ) {
            throw new Exception();
        }


    }

}


/*  five keywords:
 *1. try
 *2. catch
 *3. throw
 *4. throws
 *5. finally
 *
 *
 *if the type of the exception is known then we use the specific exception clss like ArithmeticException
 *which is the subclass of the Exception class...
 */

