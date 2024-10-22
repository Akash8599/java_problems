import java.util.HashMap;
import java.util.Map;

//@FunctionalInterface
interface MyInterface {

    default double mymethod(){
        System.out.println("Hi");
        return 0.0;

    }
//    void nerwMtehod();
}

class MyClass implements MyInterface{
    public void myMethod(){
        System.out.println("This is my class");
    }
}

public class MyMainClass{
    public static void main(String[] args) {
        new MyClass().myMethod();

        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Akash");
        int hascode = hashmap.hashCode();
        System.out.println(hascode);

    }
}
