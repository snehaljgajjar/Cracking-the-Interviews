import java.util.Scanner;

/**
 * Created by Snehal on 2/9/2017.
 *
 * Time Complexity = O(n)
 */
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's print prime number under 1000:");
        //int num = sc.nextInt();
        //System.out.println("Number " + num +" is prime:"+ isPrime(num));

        //Printing all prime number under 1000
        for(int i=0;i<=15; i++)
            System.out.println(i+ " fact is :" + factorial(i));
    }

    private static int factorial(int number) {
        if(number < 0)
            return -1;
        else if(number==0)
            return 1;
        else
            return  number* factorial(number-1);
    }
}
