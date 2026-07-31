package common;

public class InterviewtrickyQuetions {

    public static void main(String[] args) {



        // This will print false. This is because the equals() method of
        // StringBuilder is not overridden. So it will use the default
        // equals() method of Object class, which will compare the references
        // (memory addresses) of the objects, not the actual content of the
        // objects. Since the two StringBuilder objects are created separately
        // they will have different memory addresses, so the equals() method
        // will return false.
        StringBuilder sb1 = new StringBuilder("Hi");
        StringBuilder sb2 = new StringBuilder("Hi");

        System.out.println(sb1.equals(sb2));

        

    }
}
