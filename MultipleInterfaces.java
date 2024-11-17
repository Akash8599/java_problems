public class MultipleInterfaces {
    public static void main(String[] args) {
        Temp temp  = new Temp();
        temp.show();
    }


}
class Temp implements D, C{
    @Override
    public void show(){
        D.super.show();
    }
}
 interface D{
    default void show(){
        System.out.println("Interface A");
    }
}

interface C{
    default void show(){
        System.out.println("Interface C");
    }
}