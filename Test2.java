import com.sun.xml.internal.ws.server.ServerRtException;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {

        //Given an array of integers of size N, the task is to find the first non-repeating element in this array.

        int [] arr = {1,1,2 , 2, 3,4,5};



        int [] array = {1,2, 4,5, 6};

        int start = array[0];



        int last = array[array.length-1];

        int k = 5;
//
//        while (start <= last){
//
//            int mid = (start+last)/2;
//
//            int midElemt = array[mid];
//
//            if(k> mid){
//                start = mid+1;
//            }
//            else if(k<mid ){
//                last = mid-1;
//            }
//            else if(k == mid){
//                return mid;
//            }
//        }

        Student [] studentObject = {new Student(15,"Kiran") , new Student(15, "Akash"), new Student(18, "Tejas")};

        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int nonRepaptativeElemnt = -1;

        for(int i = 0; i<studentObject.length; i++){
            hashmap.put(studentObject[i].getAge(), hashmap.getOrDefault(studentObject[i].getAge(),0)+  1);
        }
        System.out.println(hashmap);


        for(int i = 0;i<studentObject.length; i++){
            if(hashmap.get(studentObject[i].getAge()) == 1 ){
                nonRepaptativeElemnt = studentObject[i].getAge();
                break;
            }
        }


        System.out.println("Non Repitative element : " + nonRepaptativeElemnt);

    }
}



