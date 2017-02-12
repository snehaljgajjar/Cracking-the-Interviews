package Excercise;

/**
 * Created by Snehal on 2/11/2017.
 *
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the
 other.
 Hints: #7, #84, #722, #737
 */
public class Ex2_CheckPermutation {
    public static void main(String[] args){
        String str1 ="ABC";
        String str2 ="CBA";
        isPermutation(str1,str2);

        String temp1 = (isPermutation(str1,str2))? "True" : "False" ; //O(n) and space complexity = O(n)
        System.out.println(str1 +" is permutation of  "+  str2 +" is "+ temp1 );


        String temp2 = (permutation(str1,str2))? "True" : "False" ; //O(n) and space complexity = O(n)
        System.out.println(str1 +" is permutation of  "+  str2 +" is "+ temp1 );


    }

    private static boolean permutation(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;

        return sort(str1).equals(sort(str2));
    }

    private static String sort(String str) {
        char[] content = str.toCharArray();
        java.util.Arrays.sort(content);
        //System.out.println(content);
        return new String(content);
    }

    private static boolean isPermutation(String str1, String str2) {
        int val1 = 0;
        int val2 = 0;

        for(int i = 0 ; i<str1.length() ; i++){

            val1 = val1 + str1.charAt(i);
            val2 = val2 + str1.charAt(i);
        }
        if(val1 == val2)
            return true;
        else
            return  false;
    }


}
