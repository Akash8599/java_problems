import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add string");
        String s =  scanner.nextLine();
        s.toLowerCase();

        int index = getNonRepeatingChar(s);
        System.out.println("First Non repeating character is : " + s.charAt(index));


    }

    private static int getNonRepeatingChar(String s ){
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c: s.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        }

        for (char c: s.toCharArray()){
            if (hashMap.get(c) == 1){
                return s.indexOf(c);
            }
        }
        return -1;
    }
}
