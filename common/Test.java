package common;

class A {
    int x = 20;

    public  void get(){
        System.out.println("A");
    }

}

 abstract class Abs {
    public abstract void get();

    public void method(){
        System.out.println("ABS abstarct method");
    }

}
 class B extends A {
    int x = 30;

//    @Override
    public  void get(){
        System.out.println("B");
    }
}

 class F extends Abs {
     int x = 40;

     @Override
     public void get() {

     }
 }
public class Test {
    public static void main(String[] args)
    {
//        B b = new B();
//        System.out.println(b.x);   // 30
//
//        A a = new A();
//        System.out.println(a.x);  // 20
//
        A a2 = new B();
        System.out.println(a2.x); //20
//
//        A a3 = new B();
//        int x= ((F) a3).x;
//
//        B b2 = new A();
//        System.out.println(b2.x);  // error

//        A.get();
//        B.get();;

        A a = new B();
        a.get();

//        Abs abs = new Abs() ;
    }
}