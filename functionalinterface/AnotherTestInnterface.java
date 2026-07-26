package functionalinterface;

@FunctionalInterface
public interface AnotherTestInnterface {
    public abstract void  getEmployee();

    public default void saveEpployee(){
        System.out.println("Save Emplyee fromm another interface");
    }

    public static void eployee(){
        System.out.println("Delete employee from another interface");
    }

}
