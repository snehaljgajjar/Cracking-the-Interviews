import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.pow;

/**
 * Created by Snehal on 2/9/2017.
 Example: Print all positive integer solutions to the equation a3 + b3 = c3+ d3
 and d are integers between 1 and 1000.
 pa no =80
 */

public class FindingPair_Matching_SumForCube {

    public static void main(String args[]){

        int num =3;
        //System.out.println("Temp :"+ temp +"Cube root of 27 : " + pow(27,temp ));
        System.out.println("...........................Now lets see worst case with O(n^4)  .................");
        System.out.println();

        findingPair(num);  // Time Complexity : n^4

        System.out.println();
        System.out.println();
        System.out.println("...........................Now lets see optimize 1 with O(n^3)  .................");
        System.out.println();

        findingPairOptimize1(num); // Time Complexity : n^3

        System.out.println();
        System.out.println();
        System.out.println("...........................Now lets see optimize 2  with O(n^2).................");
        System.out.println();

        findingPairOptimize2(num); // Time Complexity : n^2
    }

    private static void findingPairOptimize2(int num) {
        Map<Double, Integer[]> mapObject = new HashMap<Double,Integer[]>();

        for(int c = 1 ;c<num; c++){
            for (int d = 1 ; d<num ;d++){
                Integer[] pair = new Integer[]{c,d};
                double rightSideSum =  pow(c,3) + pow(d,3);
                mapObject.put(rightSideSum, pair);
            }
        }

        for(int a = 1 ; a<num ; a++){
            for(int b = 1; b<num ; b++){
                double temp =pow(a,3) + pow(b,3);
                if(mapObject.containsKey(temp)){
                    Integer[] p= mapObject.get(temp);
                    if(p[0] != p[1])
                        System.out.println("Pair: ( " +a + " , " + b + " ) and ("+ p[1] + " , " + p[0] +")");
                    System.out.println("Pair: ( " +a + " , " + b + " ) and ("+ p[0] + " , " + p[1] + ")");
                }
            }
        }
    }

    private static void findingPairOptimize1(int num) {

        for(int a = 1 ; a<num ; a++){
            for(int b = 1; b<num ; b++){
                for(int c = 1 ;c<num; c++){
                        double sumLeft = pow(a,3) + pow(b,3) - pow(c,3);
                        int d = (int)pow(sumLeft,1.0/3.0);
                        if(pow(a,3) + pow(b,3) ==  pow(c,3) + pow(d,3) ){
                            System.out.println("Pair: (" +a + " , " + b + " ) and (" + c + " , " + d + " )" );
                        }
                }
            }
        }
    }
    private static void findingPair(int num) {

        for(int a = 1 ; a<num ; a++){
            for(int b = 1; b<num ; b++){
                for(int c = 1 ;c<num; c++){
                    for (int d = 1 ; d<num ;d++){
                        double sumLeft = pow(a,3) + pow(b,3);
                        double sumRight = pow(c,3) + pow(d,3);
                        if(sumLeft == sumRight){
                            System.out.println("Pair: (" +a + " , " + b + " ) and (" + c + " , " + d + " )" );
                        }

                    }
                }
            }
        }
    }
}
