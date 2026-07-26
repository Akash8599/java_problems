package functionalinterface;

public class ImplementInterface implements TestInterface,AnotherTestInnterface {

    @Override
    public void getEmployee() {
        System.out.println("Get employee called");
    }

    @Override
    public void saveEpployee(){
        System.out.println("save in class");
        TestInterface.super.saveEpployee();
    }


//    public default void saveEpplo(){
//        System.out.println("save in class");
//        TestInterface.super.saveEpployee();
//    }

//    @Override
    public static void eployee(){
        System.out.println("Delete employee from another interface");
    }
    //    @Override
    public void deleteEpployee(){
        System.out.println("Delete in class");
    }
}
