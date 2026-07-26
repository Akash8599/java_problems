package inheritance;

class Parent {

    public int  a =  10;
    public  void method(){
        System.out.println("Parent...");
    }


}

class Child extends Parent {


   public int a = 20;
    public  void method(){
        System.out.println("Child...");
    }
}
public class InheritanceClass {

    public static void main(String[] args) {

//        Parent parent = new Parent();
//        parent.method();

        Parent p = new Child();
        p.method();
        System.out.println(p.a);


//        Child child = new Child();
//        child.method();

//        Child child1 = new Parent();
    }

}
