package functionalinterface;

public interface TestInterface {

    public abstract void  getEmployee();

    public default void saveEpployee(){
        System.out.println("Save Emplyee");
    }
    public static void deleteEpployee(){
        System.out.println("delete Emplyee");
    }
}
