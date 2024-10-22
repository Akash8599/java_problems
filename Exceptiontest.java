class Parent{
    public void m1() throws ArrayIndexOutOfBoundsException{
        System.out.println("M1 from parent called");
    }
}

class Child extends Parent{
    public void m1() throws IndexOutOfBoundsException{
        System.out.println("M1 from child called");
    }

    public void m2(){
        System.out.println("M2 from child called");
    }
}
    public class Exceptiontest {

    

        public static void main(String[] args) {

            Parent p =new Child();
            p.m1();
        }

    }

