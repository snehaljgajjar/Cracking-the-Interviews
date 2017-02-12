package Excercise;

import java.util.Hashtable;

/**
 * Created by Snehal on 2/11/2017.
 *
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 cannot use additional data structures?
 Hints: #44, #7 7 7, #732
 */
public class Ex1_IsUnique {
    public static void main(String[] args){
        String input = "ABC";
        //System.out.println("String is unique : "+isUniqueWithBoolean("ABC") );

        String temp1 = (isUniqueWithHashTable(input))? "Unique" : "Not Unique" ; //O(n) and space complexity = O(n)
        System.out.println("String "+ input +" is "+ temp1 );
        System.out.println("......................");

        String temp2 = (isUniqueWithBoolean(input))? "Unique" : "Not Unique" ; //O(n) and space complexity = O(1)
        System.out.println("String "+ input +" is " + temp2 );
        System.out.println("......................");

        String temp3 = (isUniqueWithoutNewDataSpace(input))? "Unique" : "Not Unique" ; //O(n^2) and space complexity = O(1)
        System.out.println("String "+ input +" is " + temp3 );

    }

    private static boolean isUniqueWithoutNewDataSpace(String input) {
        for(int i = 0; i < input.length(); i++){
            for(int j = i+1 ; j < input.length() ; j++){
                if(input.charAt(i) == input.charAt(j))
                    return false;
            }
        }
        return true;
    }

    private static boolean isUniqueWithBoolean(String str) {
        Boolean[] valOfString = new Boolean[128];
        if(str.length() > 128) return false;

        for(int i =0 ; i< str.length();i++){
            int val = str.charAt(i);
            if(valOfString[val] != null && valOfString[val] == true)
                return false;
            valOfString[val] = true;
        }
        return true;
    }

    private static boolean isUniqueWithHashTable(String str) {
        Hashtable<Character,Integer> htObj = new Hashtable<Character,Integer>();
        boolean isUnique = true;
        for(int i =0 ; i<str.length();i++){
            if(htObj.containsKey(str.charAt(i))) {
                htObj.put(str.charAt(i), htObj.get(str.charAt(i))+ 1 );//System.out.println("Duplicate element : " + str.charAt(i) + " repeat : " + htObj.get(str.charAt(i))+ " times.");
                isUnique = false;
                return isUnique;
            }else{
                htObj.put(str.charAt(i), 0);//System.out.println(htObj.get(str.charAt(0)));
            }
        }
        return isUnique;
    }
}
