/**
 * Created by Snehal on 2/10/2017.
 *
 * Example: Design an algorithm to print all permutations of a string. For simplicity, assume all cha r acters
 are unique.
 */
public class StringPermutation {
    static int i = 0;
    public static void main(String[] args){
        stringPermutation("ABC", "");
        System.out.println("Possible permutation : " + i);
    }

    private static void stringPermutation(String str , String prefix) {

        if(str.length() == 0) {
            System.out.println("String : " + prefix);
            i++;
        }else{
            for(int i = 0 ; i<str.length() ; i++){
                String rem = str.substring(0,i) + str.substring(i+1);
                //String s = str1.substring(0,i);

                stringPermutation(rem, prefix + str.charAt(i));
            }
        }


    }


}

