package common;

 abstract class TestAbstract {
    public void method(){
        System.out.println("Parent");
    }

//    public abstract void m1();

    public void method1(){
        System.out.println("company.Parent1");
    }
}

class Child extends TestAbstract{
    public void method12(){
        System.out.println("Child");
    }
}
public class  AbstractClass{
    public static void main(String[] args) {
        TestAbstract testAbstract = new Child() ;
        testAbstract.method();
    }
}

