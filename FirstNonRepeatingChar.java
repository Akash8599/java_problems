import java.util.*;
        import java.io.*;
        import java.util.LinkedHashMap;
        import java.util.Map;



public class FirstNonRepeatingChar {

    public static void main (String[] args) {
        // Arguments will be read by STDIN
        Scanner s = new Scanner(System.in); // do not change this
        String inputLine = s.nextLine().toLowerCase(); // do not change this
        s.close();

        char rslt = firstNonRepeatingChar(inputLine);
        if(rslt != 0)
            System.out.println("First Non-repeating Character :"+ rslt);
        else
          System.out.println("No repeating Character present");
    }


    public static char firstNonRepeatingChar(String inputLine){
        Map<Character,Integer>charCount =new LinkedHashMap<>();
        for(char ch : inputLine.toCharArray()){
            if(ch!=' '){
                charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
            }
        }

        for(Map.Entry<Character,Integer> entry : charCount.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }



        return 0;

    }
}
