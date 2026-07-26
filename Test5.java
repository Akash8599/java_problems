import java.math.BigDecimal;

public class Test5 {
    private static int counter = 0;

    public Test5() {

    }

    void Test5() {
        counter = 20;
    }


     Test5(int x){
        counter = x;
    }
    public static void main(String[] args) {
        Test5 test = new Test5();
        System.out.println(counter);

//        long s = 8;
//
//         int ss = s + 8;
//
//        System.out.println(ss);
    }
}