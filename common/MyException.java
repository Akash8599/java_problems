package common;

class SuperClass {

    void method() throws ArithmeticException

    {

        System.out.println("common.SuperClass");

    }
}
class SubClass extends SuperClass {


    void method() throws ArithmeticException {

        System.out.println("common.SubClass");

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

