package common;

import streams.StudentTest;

import java.util.*;
import java.util.stream.Collectors;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {


        String s = "pwwkew";
        Map<Character, Integer> map = new HashMap<>();
        int  left = 0;
        int finalLength = 0;

        List<StudentTest> list = new ArrayList<>();
        list.add(new StudentTest(12, "Akash", 10000, "Mechanical"));
        list.add(new StudentTest(13, "Tejas", 20000, "Mechanical"));
        list.add(new StudentTest(14, "Samyak", 20000, "Mechanical"));
        list.add(new StudentTest(15, "Raj", 20000, "Mechanical"));

        list.stream().sorted(Comparator.comparing(StudentTest::getName)).collect(Collectors.toList()).forEach(System.out::println);

        List<Integer> ls = Arrays.asList(2,3,4,5,6,7,8);

        int el = ls.stream().filter(a -> a%2!=0).map(a -> a*a).reduce(0, Integer::sum);

//            int sum =0;
//            if(a%2 !=0){
//                 sum = sum + a*a;
//            }
//
//            return sum;
//        } );

        System.out.println(el);

        int count = 0;
        Set<Character>  set = new HashSet<>();
        for(int right = 0;  right < s.length(); right++){
            char c = s.charAt(right);
            if(set.contains(c)){
//                count  = set.size();

                count = Math.max(count, set.size());
                set.clear();


            }

            set.add(c);


        }

        System.out.println(count);

        //a
//        for(int right = 0;  right < s.length(); right++){
//            char c = s.charAt(right);  //a b
//
//            if(map.containsKey(c)){
//                left = Math.max(left, map.get(c) + 1);   // 1, 2, 3
//            }
//
//            map.put(c, right);   //a,0 b, 1 , c,2
//            finalLength = Math.max(finalLength, right-left +1);    //0, 0, 1
//
//        }
//
//        System.out.println(finalLength);

    }
}
