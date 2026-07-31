//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import java.util.ArrayList;
//
//public class MainTest {
//
//    @Test
//    public void testProcessArray_case1() {
//        ArrayList<Integer> input = new ArrayList<>();
//        input.add(2);
//        input.add(4);
//        input.add(6);
//        input.add(10);
//        input.add(7);
//        input.add(8);
//
//        int expected = 2;
//        int actual = Main.processArray(input);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testProcessArray_case2() {
//        ArrayList<Integer> input = new ArrayList<>();
//        input.add(2);
//        input.add(3);
//        input.add(4);
//
//        int expected = 0;
//        int actual = Main.processArray(input);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testProcessArray_case3() {
//        ArrayList<Integer> input = new ArrayList<>();
//        input.add(20);
//        input.add(20);
//        input.add(20);
//
//        int expected = 3;
//        int actual = Main.processArray(input);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testProcessArray_case4() {
//        ArrayList<Integer> input = new ArrayList<>();
//        input.add(1);
//        input.add(3);
//        input.add(5);
//
//        int expected = 0;
//        int actual = Main.processArray(input);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testProcessArray_case5() {
//        ArrayList<Integer> input = new ArrayList<>();
//        input.add(0);
//        input.add(10);
//        input.add(10);
//
//        int expected = 1;
//        int actual = Main.processArray(input);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testProcessArray_case6() {
//        ArrayList<Integer> input = new ArrayList<>();
//        input.add(2);
//        input.add(4);
//        input.add(6);
//        input.add(8);
//        input.add(2);
//
//        int expected = 1;
//        int actual = Main.processArray(input);
//        assertEquals(expected, actual);
//    }
//}
