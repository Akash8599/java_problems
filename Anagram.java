import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        int count = 0;
        boolean isAnagram = false;
        for(int i =0; i<a.length(); i++){
            for(int j = i; j<=b.length(); j++){
                if(a.charAt(i)==b.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        if(count == a.length()){
            return isAnagram;

        }
        return isAnagram;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = "anagram";
        String b = "margana";
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}