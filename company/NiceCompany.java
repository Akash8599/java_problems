package company;

import java.util.ArrayList;
import java.util.List;

public class NiceCompany {
    public static void main(String[] args) {
        //continuous sequence numbers
        // in array
        // String [] a =

//        Find Continous seq of numbers in array
//        input : {"1", "2","3","5","9", "a", "6", "7" ,"8" ,"4" ,"@", "-5", "-7" ,"-3", "-2" ,"-1"}
//        output :
        //kinesis real  -> timme data processing -> 30k event processing -> afka  streams with spring boot -,apach flink
        // angualr ,, rest api -> aws cloud ->
//[1 2 3]
//[6 7 8]
//[-3 -2 -1]

        String [] arr = {"1", "2","3","5","9", "a", "6", "7" ,"8" ,"4" ,"@", "-5", "-7" ,"-3", "-2" ,"-1"};

        List<List<Integer>> result = findSeq(arr);
        System.out.println(result.toString());
//        for ( int i = 0 ; i< arr.length; i++){
//            if (arr[i] )
//        }
//

    }

    public static List<List<Integer>> findSeq (String [] arr){
        List<Integer> currentSeq = new ArrayList<>();
        List<Integer> longSeq =  new ArrayList<>();
        List<List<Integer>> res =  new ArrayList<>();

        for (String value : arr){
            try{
                int number = Integer.parseInt(value);
                if (!currentSeq.isEmpty() && number != currentSeq.get(currentSeq.size()-1) + 1){
                    if (currentSeq.size() > 1){
//                        res.add(new ArrayList<>(currentSeq));;
                        res.add(currentSeq);;

                    }
                    currentSeq.clear();
                }

                currentSeq.add(number);
            }
            catch (NumberFormatException e){

                if (currentSeq.size() > 1){
//                    res.add(new ArrayList<>(currentSeq));;
                    res.add(currentSeq);;

                }
                currentSeq.clear();

            }
        }


//
////        for ( int i = 1 ; i< arr.length-1; i++){
////            if (isNumeric(arr[i]) && isNumeric(arr[i-1])){
////                if ((Integer.parseInt(arr[i]) - Integer.parseInt(arr[i-1]) ==1)) {
////
////                    currentSeq.add(arr[i]);
////                    currentSeq.add(arr[i-1]);
////                }
////                else{
////                        if (currentSeq.size() >=  2) {
////                            currentSeq.add(arr[i]);
////                            res.add(currentSeq);
////                            longSeq = new ArrayList<>(currentSeq);
////
////                        }
////                        currentSeq.clear();
////                    }
////                }
////            else {
////                currentSeq.clear();
////            }
////        }
////
////        if ((currentSeq.size() > longSeq.size())){
////            longSeq = new ArrayList<>(currentSeq);
////        }
        return res;
    }


    public static boolean isNumeric(String str){
        try {
            Integer.parseInt(str);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }

    }
    public static List<List<Integer>> findContinuousSequences(String[] input) {
        List<List<Integer>> continuousSequences = new ArrayList<>();
        List<Integer> currentSequence = new ArrayList<>();

        for (String value : input) {
            try {
                int number = Integer.parseInt(value);
                if (!currentSequence.isEmpty() && number != currentSequence.get(currentSequence.size() - 1) + 1) {
                    if (currentSequence.size() > 1) {
                        continuousSequences.add(new ArrayList<>(currentSequence));
                    }
                    currentSequence.clear();
                }
                currentSequence.add(number);
            } catch (NumberFormatException e) {
                if (currentSequence.size() > 1) {
                    continuousSequences.add(new ArrayList<>(currentSequence));
                }
                currentSequence.clear();
            }
        }

        // Add the last sequence if valid
        if (currentSequence.size() > 1) {
            continuousSequences.add(currentSequence);
        }

        return continuousSequences;
    }
}

