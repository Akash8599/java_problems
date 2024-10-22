import java.util.*;
        import java.io.*;
        import java.util.Scanner;

public class CountAlphabates {

    public static void main (String[] args) {
        // Arguments will be read by STDIN
        Scanner s = new Scanner(System.in); // do not change this
        String inputLine = s.nextLine(); // do not change this
        s.close();

        boolean result = containsAllLetters(inputLine);
        System.out.println(result ? "true" : "false");
    }

    public static boolean containsAllLetters(String inputLine){
        boolean [] alphabetPresent = new boolean[26];

        inputLine= inputLine.toLowerCase();

        for( char ch : inputLine.toCharArray()){
            if(ch>= 'a' && ch <= 'z'){
                alphabetPresent[ch -'a']= true;
            }
        }
        for(boolean  present : alphabetPresent){
            if(!present){
                return false;
            }
        }
        return true;
    }
    // you code will be inside this main method
    // to view the output, just print the string

    // below is a sample program output
    // System.out.print(inputLine);
}
