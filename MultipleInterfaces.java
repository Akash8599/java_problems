public class MultipleInterfaces {
    public static void main(String[] args) {
        Temp temp  = new Temp();
        temp.show();
    }


}
class Temp implements A, C{
    @Override
    public void show(){
        A.super.show();
    }
}
 interface A{
    default void show(){
        System.out.println("Interface A");
    }
}

interface C{
    default void show(){
        System.out.println("Interface C");
    }
}