import java.util.Scanner;

/**
 * Created by Snehal on 2/9/2017.
 * Time Complexity = O(n)[For printing] * O(n*n!) [For permutation call] =O(n^2 * n!)
 */
public class PermutationsOfString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's print String permutation : ABC ");
        permutation("ABC");
    }
    
    static void permutation(String str){
        permutation(str, "");
    }

    private static void permutation(String str, String prefix) {
        if(str.length()==0)
            System.out.println(prefix);
        else{
            for(int i = 0 ;i <str.length() ; i++){
                String rem = str.substring(0,i) + str.substring(i+1);
                //System.out.println("rem:" + rem);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }
}
