package company;

class Parent1 {
    Parent1() {
        this("Constructor");
        System.out.println("exception.Parent class Default Constructor");
    }

    Parent1(String s) {
        System.out.println("exception.Parent Class Param  " + s);
    }
}

public class WissenTech extends Parent1 {
    WissenTech() {
//        this("Construuctor");
//        super("Constructor");

        System.out.println("exception.Child Class Default Constructor");
    }

    WissenTech(String s) {

        System.out.println("exception.Child Class Param Constructor " + s);
    }

    

    public static void main(String[] args) {
        WissenTech obj = new WissenTech();
    }
}