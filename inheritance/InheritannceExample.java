package inheritance;

import java.util.function.Predicate;

interface A{
    public default void method(){
        System.out.println("Interface A Default method called ......");
    }

    public void method1();
}

interface B{

    public default void method(){
        System.out.println("Interface B Default method called ......");
    }
//    public static void method1(){
//        System.out.println("Static method from B");
//    }

//    public void method1();

}
public class InheritannceExample implements A, B{
    @Override
    public void method() {
        B.super.method();
    }

    @Override
    public void method1() {

    }


//    @Override
//    public void method1(){
//        System.out.println("Class c");
//    }



    public static void main(String[] args) {
//        InheritannceExample obj = new InheritannceExample();
//        obj.method();

        Predicate<String> a = (c) -> c.equals("Akash");
        System.out.println(a.test("Akash"));

//        Consumer<String> con = (h) -> System.out.println("Consumer " + h);
//        con.accept("Akaash");

//        InheritanceSingle a1 = new InheritanceSingle();
//        a1.method();

//        InheritanceSingle a2 = new InheritanceSecondChild();
//        a2.inheritanceSingleChildMethod();

        InheritanceSingle a3 = new InheritanceSingle();
//        a3.inheritanceSecond();
        a3.inheritanceSingleChildMethod();


    }
}
