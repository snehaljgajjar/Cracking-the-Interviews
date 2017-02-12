/**
 * Created by Snehal on 2/9/2017.
 * Time Complexity= O( lon n)
 */
public class PowerOf2 {
    public static void main(String args[]){
        powerof2(50);
    }

    private static int powerof2(int num) {
        if(num <1)  return 0;
        else if(num==1){
            System.out.println(1);
            return 1;
        } else {
            int prev = powerof2(num/2);
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
    }
}
