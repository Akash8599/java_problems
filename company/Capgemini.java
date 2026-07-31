package company;

public class Capgemini {
    public static void main(String[] args) {
        System.out.println("company.Capgemini");
        FullNameConcat concat = ((firstName, lastName) -> firstName+  " " + lastName);
        String res = concat.concat("Akash", "Patel");
        System.out.println(res);
    }

}

@FunctionalInterface
interface FullNameConcat{
    String concat(String firstName, String lastName);
}
