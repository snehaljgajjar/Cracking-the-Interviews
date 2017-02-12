import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
//import java.util.LinkedHashMap;

import static java.lang.Math.abs;

/**
 * Created by Snehal on 2/9/2017.

 Example: Given an array of distinct integer values, count the number of pairs of integers that
 have difference k. For example, given the array { 1, 7, 5, 9, 2, 12, 3} and the difference
 k = 2,there are four pairs with difference2: (1, 3), (3, 5), (5, 7), (7, 9).
 */

public class FindingPairForGivenDifference {
    public static void main(String[] args){
        int[] ary = { 1, 7, 5, 9, 2, 12, 3};
        int diff = 2;
        System.out.println("Using Find Pair function : Time complexity n^2");
        findingPair(ary,diff);
        System.out.println("Using Find Pair function : Time complexity n");
        findingPairWithCache(ary,diff);
    }
    private static void findingPairWithCache(int[] ary, int diff) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i = 0 ; i<ary.length ; i++){
            int temp = ary[i] - diff;
            m.put(temp,ary[i]);
        }
        for(int j = 0 ; j< ary.length ; j++){
            if(m.containsKey(ary[j])){
                System.out.println("j: "  +j+ " Pair : ( "+ ary[j] +" , "+ m.get(ary[j]) + " )" );
            }
        }

        System.out.println("Hash map: " + m);
    }
    private static void findingPair(int[] ary, int diff) {
        for(int i = 0 ; i<ary.length ; i++){
            for(int j = i+1; j<ary.length ; j++){
                if(diff == abs(ary[i] - ary[j]) ){
                    System.out.println(" pair: (" + ary[i] +" , " +ary[j] + ")");
                    //System.out.println("remaining [i] :" + remaining[j]);
                    //return true;
                }
            }

        }
    }



}
