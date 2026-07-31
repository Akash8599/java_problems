package common;

class interfaceDemo {
    public  void method1() throws java.lang.Exception {
        System.out.println("exception.Parent");
    }
}

public class Child1 extends interfaceDemo{
    public static void main(String[] args) {

    }

//    @Override
//    public  void method1() throws IOException{
//        try {
//            System.out.println("exception.Parent");
//
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

}
