package common;

public class ReverseInt {
    public static void main(String[] args) {
        int x= 1534236469;
        int result = 0;

        while(x>0){
            int lastDigit = x%10;

            result = result*10 + lastDigit;

            x = x/10;

        }
        System.out.println(result);
//        LinkedListDummy listNode = new LinkedListDummy(Collections.singleton(MIN_VALUE));
//        Arrays.sort();
    }
}
