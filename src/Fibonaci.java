/**
 * Created by Snehal on 2/9/2017.
 *
 * Time Complexity = O(2^n)
 */
public class Fibonaci {
    public static void main(String args[]){
        allFibonaci(45);
    }

    public static void allFibonaci(int num){
        for(int i=0 ; i<num ; i++)
            System.out.println("Fibonoci of  "+ i + " : " + fibonaci(i));
    }
    public static int fibonaci(int num){
        if(num <=0) return 0;
        else if(num == 1) return 1;

        return fibonaci(num-1) + fibonaci( num- 2);
    }
}
