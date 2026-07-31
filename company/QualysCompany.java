package company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QualysCompany{
    public static void main(String[] args) {

        try{
            int a = 10/0;
            System.out.println("In try block");
        }
        catch (Exception e){
            System.out.println("In exception block");
        }
//        catch (ArithmeticException e){
//            System.out.println("In arithematic exception");
//        }
        catch (Throwable e){
            System.out.println("In throwable block");
        }
        int [] a = {9,7, 5,9, 6, 3, 9};


        Map< Integer, Integer> hashmap =  new HashMap<>();

        List<Integer> resultset = new ArrayList<>();

        for(int num : a){
            int count = hashmap.getOrDefault(num, 0);

            if (count < 2){
                resultset.add(num);
                hashmap.put(num, count+1);

            }
        }

        System.out.println(resultset);

    }
}