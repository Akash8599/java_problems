 class A {
    int x = 20;
}
 class B extends A {
    int x = 30;
}
public class Test {
    public static void main(String[] args)
    {
        B b = new B();
        System.out.println(b.x);   // 30

        A a = new A();
        System.out.println(a.x);  // 20

        A a2 = new B();
        System.out.println(a2.x);  //30
//
//        B b2 = new A();
//        System.out.println(b2.x);  // error
    }
}