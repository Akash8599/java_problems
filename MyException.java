import java.io.IOException;

class SuperClass {

    void method() throws ArithmeticException

    {

        System.out.println("SuperClass");

    }
}
class SubClass extends SuperClass {


    void method() throws ArithmeticException {

        System.out.println("SubClass");

    }

}
    public class MyException {
        public static void main(String args[]) throws Exception {

            SuperClass s = new SubClass();

            s.method();

            try{
                System.out.println("Hello");

            }
//            System.out.println("AKash");
            catch (Exception e){

            }

        }


    }

