package common;

import streams.StudentTest;

public class TestOperators {
    public static void main(String[] args) {
//        int a = 10 & 2;
//        System.out.println(a);

//        short a = 10;
//        int b = 2;
//        short c = a+b;
//        System.out.println(c);


        String a = "Akash";
        String b = "Akash";
        System.out.println(a==b);

        String ab = new String("Akash");
        String bc = new String("Akash");

        System.out.println("ab==bc "+(ab==bc));
        System.out.println("ab==bc "+(ab.equals(bc)));

        StudentTest student1 = new StudentTest();
        student1.setAge(11);
        StudentTest student2 = new StudentTest();
        student2.setAge(11);

        System.out.println(student1==student2);

//        String a = "Akash";



//         String b= a.concat("Kamble");
//        System.out.println(a);
//        System.out.println(b);
    }
}
