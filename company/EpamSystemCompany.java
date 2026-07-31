package company;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class EpamSystemCompany {
    public static void main(String[] args) {

        int[] inputArray = {2, 2, 1, 1, 1, 2, 2};

        int result = findMajorityElement(inputArray);

        System.out.println(result); // Expected output: 2

    }


    private static int findMajorityElement(int [] arr){

       Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(a -> a, Collectors.counting()));

       //2 : 4
        //1: 3

      return map.entrySet().stream()
               .filter(a -> a.getValue()>  arr.length/2) //4
               .map(Map.Entry::getKey) //2
               .findFirst() //2
               .orElse(-1);


    }


}
