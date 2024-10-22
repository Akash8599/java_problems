public class StaticNullReference {
    public static void main(String[] args) {
        TestStatic test = null;

        test.show();
    }

}

class TestStatic{
    public static void show(){
        System.out.println("Test called....");
    }
}
