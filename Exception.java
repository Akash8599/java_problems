public class Exception {
    public static void main(String[] args) {
        try
        {
            String b = "hi";
            String c = new String("hi");
            System.out.println(b.equals(c));
            System.out.println(b==c);
            b.toUpperCase();
            System.out.println(b);
            b =b.toUpperCase();
            System.out.println(b);
            int a = 1/0;
        }
        catch (ArithmeticException e){
            System.out.println("In arithmetic exception");
        }
        catch (java.lang.Exception e){
            System.out.println("In exception");
        }
    }
}
