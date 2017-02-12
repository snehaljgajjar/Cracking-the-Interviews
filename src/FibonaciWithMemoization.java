/**
 * Created by Snehal on 2/9/2017.
 *
 *  Time Complexity = O(n)
 */
public class FibonaciWithMemoization {
    public static void main(String args[]){
        allFibonaci(45);
    }

    public static void allFibonaci(int num){
        int[] memo = new int[num+1];
        for(int i=0 ; i<num ; i++)
            System.out.println("Fibonoci of  "+ i + " : " + fibonaci(i,memo));
    }
    public static int fibonaci(int num, int[] memo){
        if(num <=0) return 0;
        else if(num == 1) return 1;
        else if(memo[num] > 0) return memo[num];

        memo[num] = fibonaci(num-1, memo) + fibonaci( num- 2,memo);

        return memo[num];
    }
}
