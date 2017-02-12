import java.util.Scanner;

/**
 * Created by Snehal on 2/9/2017.
 * Time Complexity = O( sqrt(n))
 */
public class PrimeChecking   {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's print prime number under 1000:");
        //int num = sc.nextInt();
        //System.out.println("Number " + num +" is prime:"+ isPrime(num));

        //Printing all prime number under 1000
        for(int i=2;i<=1000; i++)
            System.out.print(isPrime(i)?i+"\n":"");
    }

    public static final boolean isPrime(int number){
        for(int x=2 ; x*x < number ;x++){
            if(number%x == 0)
                return false;
        }
        return true;
    }
}
