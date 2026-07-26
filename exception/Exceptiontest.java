package exception;

class Parent{
    public void m1() throws ClassNotFoundException{
        System.out.println("M1 from parent called");
    }
}

class Child extends Parent{
    public void m1()  throws  ClassNotFoundException{
        try {
            Thread.sleep(1000);
            System.out.println("M1 from child called");
        }
        catch (InterruptedException e){
            e.printStackTrace();

        }
    }

    public void m2(){
        System.out.println("M2 from child called");
    }
}
    public class Exceptiontest {

    

        public static void main(String[] args) {

//            exception.Parent p =new Child1();
//            p.m1();
        }

    }

