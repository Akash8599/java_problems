public class Nice2 {
    public static void main(String[] args) {
        num(1.1,3.1);
    }


    private static void num(int a, int b){
        System.out.println("NUM" + a+b);
    }
    private static void num(long a, long b){
        System.out.println("LONG"+ a+b);
    }

    private static void num(float a, float b){
        System.out.println("float"+ a+b);
    }

    private static void num(double a, double b){
        System.out.println("double"+ a+b);
    }
}
